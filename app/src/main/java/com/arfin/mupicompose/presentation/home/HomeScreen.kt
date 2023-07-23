package com.arfin.mupicompose.presentation.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.arfin.mupicompose.R
import com.arfin.mupicompose.domain.model.Movies
import com.arfin.mupicompose.presentation.home.components.HomeHeader
import com.arfin.mupicompose.presentation.home.components.MoviesCarousel
import com.arfin.mupicompose.presentation.home.components.SearchBarPlaceHolder
import com.arfin.mupicompose.presentation.home.components.SectionHeader

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    navigateToSearch: () -> Unit
) {
    val movies by viewModel.movieList.collectAsState()
    Log.d(HomeViewModel.TAG, "getMovieList: ${movies.movies}")

    LazyColumn(
        modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(vertical = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp),
    ) {
        item {
            HomeHeader()
        }
        item {
            SearchBarPlaceHolder(navigateToSearch = navigateToSearch)
        }
        item {
            HomeContent(moviesData = movies.movies, navigateMovie = {})
        }


    }


}

@Composable
fun HomeContent(
    moviesData: List<Movies>,
    navigateMovie: () -> Unit,

    ) {
    SectionHeader(headerText = "Now Showing")
    MoviesCarousel(
        modifier = Modifier.padding(vertical = 10.dp),
        imageWidth = 190.dp,
        imageHeight = 270.dp,
        movies = moviesData,
        navigateMovie = navigateMovie
    )
}

