package com.clone.search.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clone.search.data.DataItems
import com.clone.search.data.suggestDataItems
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Duration
import java.util.Random

/**
 * Created by arwani on 10/31/23.
 */
class MainViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<List<DataItems>>(emptyList())
    val uiState: StateFlow<List<DataItems>> = _uiState.asStateFlow()

    var searchValue by mutableStateOf("")
        private set

    init {
        updateCartSuggest(searchValue)
    }

    fun updateInputValue(inputValue: String) {
        searchValue = inputValue
        updateCartSuggest(searchValue)
    }

    fun updateCartSuggest(newValue: String) {
        viewModelScope.launch {
            if (newValue.isEmpty()) {
                val newItems = randomData()
                delay(100)
                _uiState.value = newItems
            } else {
                val updateItems = updateData(newValue)
                _uiState.value = updateItems
            }
        }
    }

    private suspend fun randomData(): List<DataItems> {
        val deferredResults = viewModelScope.async {
            suggestDataItems.shuffled(Random()).take(10)
        }
        return deferredResults.await()
    }

    private suspend fun updateData(newValue: String): List<DataItems> {
        val deferredResults = viewModelScope.async {
            suggestDataItems.filter { item ->
                item.textDesc.contains(
                    newValue,
                    ignoreCase = true
                )
            }
        }
        return deferredResults.await()
    }
}