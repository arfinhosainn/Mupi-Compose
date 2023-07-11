package com.arfin.mupicompose.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.arfin.mupicompose.domain.model.Movies
import com.arfin.mupicompose.presentation.home.components.MoviesCarousel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val movies by viewModel.movieList.collectAsState()
    Log.d(HomeViewModel.TAG, "getMovieList: ${movies.movies}")

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HomeContent(moviesData = movies.movies, screenState = movies) {

        }


    }


}

@Composable
fun HomeContent(
    moviesData: List<Movies>,
    screenState: HomeScreenState,
    navigateMovie: () -> Unit
) {

    val screenWidth = LocalConfiguration.current.screenWidthDp
    val imageWidth = 264.dp
    val scaledImageWidth = imageWidth + imageWidth * 0.07f
    val centerCarouselPadding =
        PaddingValues(horizontal = (screenWidth.div(2).dp - scaledImageWidth.div(2)))

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            MoviesCarousel(
                imageWidth = imageWidth,
                imageHeight = 400.dp,
                movies = moviesData,
                navigateMovie = navigateMovie
            )

        }
    }

}