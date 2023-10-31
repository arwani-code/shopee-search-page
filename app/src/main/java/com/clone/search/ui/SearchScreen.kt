package com.clone.search.ui

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.search.data.DataItems
import com.clone.search.ui.components.DeleteSearchHistory
import com.clone.search.ui.components.InputSuggestion
import com.clone.search.ui.components.SearchTopBar


/**
 * Created by arwani on 10/31/23.
 */
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = viewModel()
) {
    ConstraintLayout {
        val (topAppBar, freeShipping, suggest1, suggest2, suggest3) = createRefs()
        val (deleteHistory, startRefresh, gridItem, lazyItem) = createRefs()

        SearchTopBar(
            modifier = modifier
                .constrainAs(topAppBar) {
                    top.linkTo(parent.top)
                    bottom.linkTo(freeShipping.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            input = viewModel.searchValue,
            onChangeInput = { viewModel.updateInputValue(it) },
            clearInput = { viewModel.updateInputValue("") }
        )
        InputSuggestion(
            modifier = modifier
                .constrainAs(freeShipping) {
                    top.linkTo(topAppBar.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            value = "Daftar & Dapat Voucher Gratis",
            canFreeShipping = true,
            canVisible = viewModel.searchValue.isEmpty()
        )
        InputSuggestion(
            modifier = modifier.constrainAs(suggest1) {
                top.linkTo(freeShipping.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            value = "Outfit Cowok Kekinian",
            canVisible = viewModel.searchValue.isEmpty()
        )
        InputSuggestion(
            modifier = modifier.constrainAs(suggest2) {
                top.linkTo(suggest1.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            value = "Outfit Set Korean Style",
            canVisible = viewModel.searchValue.isEmpty()
        )
        InputSuggestion(
            modifier = modifier.constrainAs(suggest3) {
                top.linkTo(suggest2.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            value = "iPhone Gratis 0 Rupiah",
            canVisible = viewModel.searchValue.isEmpty()
        )
        DeleteSearchHistory(
            modifier = modifier.constrainAs(deleteHistory) {
                top.linkTo(suggest3.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            canVisible = viewModel.searchValue.isEmpty()
        )
        InputSuggestion(
            modifier = modifier.constrainAs(startRefresh) {
                top.linkTo(deleteHistory.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            value = "Pencarian Pilihan", canStartRefresh = true,
            click = {
                viewModel.updateCartSuggest(viewModel.searchValue)
            },
            canVisible = viewModel.searchValue.isEmpty()
        )
        viewModel.uiState.collectAsStateWithLifecycle().value.let { items ->
            ItemColumnGrid(
                modifier = modifier.constrainAs(gridItem) {
                    top.linkTo(startRefresh.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                suggestItems = items,
                canVisible = viewModel.searchValue.isEmpty()
            )
            ItemColumnLazy(
                modifier = modifier
                    .constrainAs(lazyItem) {
                        top.linkTo(topAppBar.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                suggestItems = items,
                canVisible = viewModel.searchValue.isNotEmpty()
            )
        }
    }
}

@Composable
fun ItemColumnGrid(
    modifier: Modifier = Modifier,
    suggestItems: List<DataItems>,
    context: Context = LocalContext.current,
    canVisible: Boolean = true
) {
    if (canVisible) {
        LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(2)) {
            itemsIndexed(suggestItems) { index, suggestItem ->
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(90.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Divider(color = Color.Gray.copy(0.7f), thickness = 0.5.dp)
                    Row(
                        modifier = modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(context)
                                .data(suggestItem.imgUrl)
                                .crossfade(true)
                                .build(),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = modifier.size(60.dp),
                        )
                        Column(
                            modifier = modifier
                                .width(120.dp)
                                .padding(horizontal = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = suggestItem.textDesc,
                                letterSpacing = 0.sp,
                                lineHeight = 18.sp,
                                fontSize = 14.sp
                            )
                        }
                        Column(
                            modifier = modifier
                                .width(1.dp)
                                .height(90.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Divider(
                                modifier = modifier.fillMaxSize(),
                                color = if (index % 2 != 1) Color.Gray.copy(0.7f) else Color.White,
                                thickness = 1.dp
                            )
                        }
                    }
                    if (index != suggestItems.lastIndex && index != suggestItems.lastIndex - 1)
                        Divider(color = Color.Gray.copy(0.7f), thickness = 0.dp)
                    else
                        Box(modifier = modifier)
                }
            }
        }
    }
}

@Composable
fun ItemColumnLazy(
    modifier: Modifier = Modifier,
    suggestItems: List<DataItems>,
    canVisible: Boolean
) {
    if (canVisible) {
        LazyColumn(modifier = modifier) {
            items(suggestItems, key = { it.textDesc }) { suggestItem ->
                Column(
                    modifier = modifier
                        .padding(top = 8.dp)
                        .height(35.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = suggestItem.textDesc, letterSpacing = 0.sp,
                        lineHeight = 18.sp, modifier = modifier.padding(start = 12.dp)
                    )
                    Divider(color = Color.Gray.copy(0.7f), thickness = 0.dp)
                }
            }
        }
    }
}





