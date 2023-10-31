package com.clone.search.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clone.search.ui.theme.OrangeShopee
import com.clone.search.ui.vector.cameraVector
import com.clone.search.ui.vector.clearInputVector
import com.clone.search.ui.vector.iconBack
import com.clone.search.ui.vector.vectorSearch


/**
 * Created by arwani on 10/31/23.
 */
@Composable
fun SearchTopBar(
    modifier: Modifier = Modifier,
    onChangeInput: (String) -> Unit,
    input: String,
    clearInput: () -> Unit
) {
    Row(
        modifier = modifier
            .height(50.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            imageVector = iconBack(),
            contentDescription = "Icon Back",
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 6.dp)
                .size(25.dp),
            tint = OrangeShopee
        )
        InputItem(
            onChangeInput = onChangeInput,
            modifier = modifier,
            input = input,
            clearInput = clearInput
        )
    }
}


@Composable
fun InputItem(
    modifier: Modifier = Modifier,
    onChangeInput: (String) -> Unit,
    input: String,
    clearInput: () -> Unit
) {
    var value by remember {
        mutableStateOf(TextFieldValue(input))
    }
    val interactionSource = remember { MutableInteractionSource() }
    BasicTextField(
        modifier = modifier
            .padding(end = 12.dp)
            .heightIn(max = 35.dp)
            .fillMaxWidth(),
        value = value,
        onValueChange = {
            value = it
            onChangeInput(value.text)
        },
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .fillMaxHeight()
                    .background(Color.White, RoundedCornerShape(percent = 10))
                    .border(
                        width = 1.dp,
                        color = OrangeShopee,
                        shape = RoundedCornerShape(percent = 10)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(modifier = modifier.padding(start = 10.dp)) {
                    if (value.text.isEmpty()) {
                        Text(
                            text = "Serba 1k",
                            fontSize = 16.sp,
                            color = Color.Gray,
                            modifier = modifier
                        )
                    }
                    innerTextField()
                }
                Row(
                    modifier = modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    if (value.text.isNotEmpty()) {
                        Box(
                            modifier = modifier
                                .padding(end = 6.dp)
                                .size(16.dp)
                                .clip(CircleShape)
                                .background(Color.Black.copy(0.3f))
                                .clickableWithoutRipple(
                                    interactionSource,
                                    onClick = {
                                        clearInput()
                                        value = TextFieldValue("")
                                    }
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = clearInputVector(),
                                contentDescription = "Icon Search",
                                modifier = modifier
                                    .size(8.dp),
                                tint = Color.White
                            )
                        }
                    }
                    Box(
                        modifier = modifier
                            .size(40.dp)
                            .background(OrangeShopee),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = vectorSearch(),
                            contentDescription = "Icon Search",
                            modifier = modifier.size(25.dp),
                            tint = Color.White
                        )
                    }
                }
            }
        },
        cursorBrush = Brush.verticalGradient(
            colors = listOf(Color.Green, Color.Green)
        ),
    )
}