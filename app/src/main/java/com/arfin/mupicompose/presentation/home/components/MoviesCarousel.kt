package com.arfin.mupicompose.presentation.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.layout.lerp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arfin.mupicompose.R
import com.arfin.mupicompose.domain.model.Movies
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MoviesCarousel(
    modifier: Modifier = Modifier,
    imageWidth: Dp,
    imageHeight: Dp,
    movies: List<Movies>,
    navigateMovie: () -> Unit,
    contentPadding: PaddingValues = PaddingValues(0.dp)

) {
    val pagerState = rememberPagerState(initialPage = 2)
    HorizontalPager(
        pageCount = movies.size,
        state = pagerState,
        contentPadding = PaddingValues(horizontal = (95).dp)
    ) { page ->

        Column(
            modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally
        ) {

            MovieCard(
                width = imageWidth,
                height = imageHeight,
                imageRes = "https://image.tmdb.org/t/p/w500/${movies[page].poster_path}",
                onImageClick = {},
                modifier = Modifier.graphicsLayer {
                    val pageOffset = (
                            (pagerState.currentPage - page) + pagerState
                                .currentPageOffsetFraction
                            ).absoluteValue

                    lerp(
                        start = ScaleFactor(1f, 0.80f),
                        stop = ScaleFactor(1f, 1f),
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale.scaleX
                        scaleY = scale.scaleY
                    }
                }
            )
        }
    }
}