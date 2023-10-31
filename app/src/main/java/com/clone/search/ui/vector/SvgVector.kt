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


/**
 * Created by arwani on 10/31/23.
 */
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

@Composable
fun cameraVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 14.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(1.172f)
                arcToRelative(
                    3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.879f
                )
                lineToRelative(0.83f, -0.828f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.827f, 3f)
                horizontalLineToRelative(2.344f)
                arcToRelative(
                    1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.707f, 0.293f
                )
                lineToRelative(0.828f, 0.828f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.828f, 5f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(6f)
                close()
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(
                    2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -0.586f
                )
                lineToRelative(-0.828f, -0.828f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.172f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(
                    2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0.586f
                )
                lineToRelative(-0.828f, 0.828f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.172f, 4f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 11f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5f)
                close()
                moveToRelative(0f, 1f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                close()
                moveTo(3f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
                close()
            }
        }.build()
    }
}

@Composable
fun clearInputVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFEE4D2D)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(1.1f, 1.1f)
                lineTo(15.2f, 15.2f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFFEE4D2D)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15f, 1f)
                lineTo(0.9f, 15.1f)
            }
        }.build()
    }
}

@Composable
fun startRefresh(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 383.748f,
            viewportHeight = 383.748f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(62.772f, 95.042f)
                    curveTo(90.904f, 54.899f, 137.496f, 30f, 187.343f, 30f)
                    curveToRelative(83.743f, 0f, 151.874f, 68.13f, 151.874f, 151.874f)
                    horizontalLineToRelative(30f)
                    curveTo(369.217f, 81.588f, 287.629f, 0f, 187.343f, 0f)
                    curveToRelative(-35.038f, 0f, -69.061f, 9.989f, -98.391f, 28.888f)
                    curveTo(70.368f, 40.862f, 54.245f, 56.032f, 41.221f, 73.593f)
                    lineTo(2.081f, 34.641f)
                    verticalLineToRelative(113.365f)
                    horizontalLineToRelative(113.91f)
                    lineTo(62.772f, 95.042f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(381.667f, 235.742f)
                    horizontalLineToRelative(-113.91f)
                    lineToRelative(53.219f, 52.965f)
                    curveToRelative(-28.132f, 40.142f, -74.724f, 65.042f, -124.571f, 65.042f)
                    curveToRelative(-83.744f, 0f, -151.874f, -68.13f, -151.874f, -151.874f)
                    horizontalLineToRelative(-30f)
                    curveToRelative(0f, 100.286f, 81.588f, 181.874f, 181.874f, 181.874f)
                    curveToRelative(35.038f, 0f, 69.062f, -9.989f, 98.391f, -28.888f)
                    curveToRelative(18.584f, -11.975f, 34.707f, -27.145f, 47.731f, -44.706f)
                    lineToRelative(39.139f, 38.952f)
                    verticalLineTo(235.742f)
                    close()
                }
            }
        }.build()
    }
}
