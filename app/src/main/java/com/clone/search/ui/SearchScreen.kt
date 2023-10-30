package com.clone.search.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import com.clone.search.ui.components.SearchTopBar

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier
) {
    ConstraintLayout {
        SearchTopBar(onChangeInput = {})
    }
}