package com.clone.search.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


/**
 * Created by arwani on 10/31/23.
 */
@Composable
fun DeleteSearchHistory(
    modifier: Modifier = Modifier,
    canVisible: Boolean
) {
    if (canVisible) {
        Column(
            modifier = modifier
                .padding(top = 12.dp, bottom = 8.dp)
                .fillMaxWidth()
                .height(35.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hapus Riwayat Pencarian",
                letterSpacing = 0.sp,
                color = Color.Black.copy(0.8f)
            )
            Divider(color = Color.LightGray.copy(0.5f), thickness = 6.dp)
        }
    }
}