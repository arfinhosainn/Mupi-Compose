package com.arfin.mupicompose.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.arfin.mupicompose.domain.model.Movies
import com.arfin.mupicompose.presentation.home.components.HomeHeader
import com.arfin.mupicompose.presentation.home.components.MoviesCarousel
import com.arfin.mupicompose.presentation.home.components.SearchBarPlaceHolder

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    navigateToSearch: () -> Unit
) {
    val movies by viewModel.movieList.collectAsState()
    Log.d(HomeViewModel.TAG, "getMovieList: ${movies.movies}")

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(40.dp),
    ) {
        item {
            HomeHeader()
        }
        item {
            HomeContent(moviesData = movies.movies, screenState = movies,
                onNavigateSearch = navigateToSearch, navigateMovie = {})
        }

    }


}

@Composable
fun HomeContent(
    moviesData: List<Movies>,
    screenState: HomeScreenState,
    navigateMovie: () -> Unit,
    onNavigateSearch: () -> Unit
) {

    SearchBarPlaceHolder(navigateToSearch = onNavigateSearch)
    MoviesCarousel(
        imageWidth = 190.dp,
        imageHeight = 270.dp,
        movies = moviesData,
        navigateMovie = navigateMovie
    )
}