package com.clone.search.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.clone.search.ui.vector.iconBack
import com.clone.search.ui.vector.vectorSearch

@Composable
fun SearchTopBar(
    modifier: Modifier = Modifier,
    onChangeInput: (String) -> Unit
) {
    Row(
        modifier = modifier
            .height(50.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = iconBack(),
            contentDescription = "Icon Back",
            modifier = modifier
                .padding(horizontal = 16.dp)
                .size(25.dp)
        )
        InputItem(
            onChangeInput = onChangeInput,
            modifier = modifier
        )
        Icon(
            imageVector = vectorSearch(),
            contentDescription = "Icon Search",
            modifier = modifier.size(25.dp)
        )
    }
}


@Composable
fun InputItem(
    modifier: Modifier = Modifier,
    onChangeInput: (String) -> Unit
) {
    var value by remember {
        mutableStateOf(TextFieldValue(""))
    }
    BasicTextField(
        modifier = modifier
            .heightIn(max = 35.dp)
            .width(280.dp),
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
                        color = Color.LightGray,
                        shape = RoundedCornerShape(percent = 10)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Serba 1k",
                    fontSize = 16.sp,
                    color = Color.Gray,
                    modifier = modifier.padding(start = 10.dp)
                )
                innerTextField()
            }
        },
        cursorBrush = Brush.verticalGradient(
            colors = listOf(Color.Green, Color.Green)
        ),
    )
}