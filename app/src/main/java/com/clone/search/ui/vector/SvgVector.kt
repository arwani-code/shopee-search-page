package com.clone.search.ui.vector

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


@Composable
fun iconBack(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Black),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(5.78416545f, 15.2727801f)
                    lineTo(12.9866648f, 21.7122915f)
                    curveTo(13.2861f, 22.0068f, 13.2861f, 22.4841f, 12.9867f, 22.7786f)
                    curveTo(12.6864f, 23.0738f, 12.2007f, 23.0738f, 11.9005f, 22.7786f)
                    lineTo(3.29347136f, 15.0837018f)
                    curveTo(3.2707f, 15.0651f, 3.2385f, 15.0729f, 3.2172f, 15.0519f)
                    curveTo(3.0624f, 14.8993f, 2.9948f, 14.7001f, 3.0003f, 14.5002f)
                    curveTo(2.9948f, 14.3003f, 3.0624f, 14.1003f, 3.2172f, 13.9477f)
                    curveTo(3.2385f, 13.9275f, 3.2715f, 13.9345f, 3.2943f, 13.9167f)
                    lineTo(11.9004739f, 6.22026848f)
                    curveTo(12.2007f, 5.9266f, 12.6864f, 5.9266f, 12.9867f, 6.2203f)
                    curveTo(13.2861f, 6.5163f, 13.2861f, 6.9936f, 12.9867f, 7.2881f)
                    lineTo(5.78416545f, 13.7276073f)
                    lineTo(24.2140442f, 13.7276073f)
                    curveTo(24.6479f, 13.7276f, 25f, 14.074f, 25f, 14.5002f)
                    curveTo(25f, 14.9264f, 24.6479f, 15.2728f, 24.214f, 15.2728f)
                    lineTo(5.78416545f, 15.2727801f)
                    close()
                }
            }
        }.build()
    }
}


@Composable
fun vectorSearch(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.53f, 19.46f)
            lineToRelative(-4.4f, -4.4f)
            arcToRelative(7.33f, 7.33f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.07f, 1.06f)
            lineToRelative(4.41f, 4.41f)
            arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f)
            arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.07f)
            close()
            moveToRelative(-15.78f, -9f)
            arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.75f, 5.75f)
            arcToRelative(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.75f, -5.72f)
            verticalLineToRelative(-0.03f)
            close()
        }
        }.build()
    }
}