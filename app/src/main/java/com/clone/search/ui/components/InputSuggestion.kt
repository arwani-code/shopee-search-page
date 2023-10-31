package com.clone.search.ui.components

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.clone.search.ui.theme.OrangeShopee
import com.clone.search.ui.vector.startRefresh


/**
 * Created by arwani on 10/31/23.
 */
@Composable
fun InputSuggestion(
    modifier: Modifier = Modifier,
    value: String,
    canFreeShipping: Boolean = false,
    context: Context = LocalContext.current,
    canStartRefresh: Boolean = false,
    click: () -> Unit = {},
    canVisible: Boolean = true
) {
    val interactionSource = remember { MutableInteractionSource() }
    if (canVisible){
        Column(
            modifier = modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .height(35.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = modifier
                    .padding(horizontal = 12.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = value, letterSpacing = 0.sp, fontSize = 14.sp)
                if (canFreeShipping) {
                    AsyncImage(
                        model = ImageRequest.Builder(context)
                            .data("https://down-id.img.susercontent.com/file/29218d6681841ae13f18a6be04f6a57b")
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = modifier.size(20.dp)
                    )
                }
                if (canStartRefresh) {
                    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = startRefresh(),
                            contentDescription = "start refresh",
                            modifier = modifier
                                .padding(end = 8.dp)
                                .size(13.dp)
                                .clickableWithoutRipple(interactionSource, click),
                            tint = OrangeShopee
                        )
                        Text(
                            text = "Muat Ulang",
                            letterSpacing = 0.sp,
                            fontSize = 13.sp,
                            color = OrangeShopee,
                            modifier = modifier
                                .clickableWithoutRipple(interactionSource, click)
                        )
                    }
                }
            }
            if (!canStartRefresh) {
                Divider(color = Color.LightGray.copy(0.5f))
            }
        }
    }
}

fun Modifier.clickableWithoutRipple(
    interactionSource: MutableInteractionSource,
    onClick: () -> Unit
) = composed(
    factory = {
        this.then(
            Modifier.clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = { onClick() }
            )
        )
    }
)