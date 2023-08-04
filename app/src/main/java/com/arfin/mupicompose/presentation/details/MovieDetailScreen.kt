package com.arfin.mupicompose.presentation.details

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arfin.mupicompose.presentation.details.components.DetailsTopBar
import com.arfin.mupicompose.presentation.details.components.MovieDescription
import com.arfin.mupicompose.presentation.details.components.MovieDetailCard


@Composable
fun MovieDetailScreen() {

    Scaffold(topBar = {
        DetailsTopBar()
    }, content = { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(paddingValues = paddingValues)
                .background(color = MaterialTheme.colorScheme.onBackground)
        ) {
            MovieDetailCard(
                width = 279.dp,
                height = 356.dp,
                imageRes = "https://m.media-amazon.com/images/M/MV5BMjMyOTM4MDMxNV5BMl5BanBnXkFtZTcwNjIyNzExOA@@._V1_.jpg"
            ) {

            }
            Spacer(modifier = Modifier.height(40.dp))
            MovieDescription(
                movieName = "Spider-Man",
                movieDirector = "John Goshling",
                movieGenre = "Action",
                movieOverview = "Martial-arts master Shang-Chi confronts the past he thought he left behind when he's drawn into Read More"
            ) {

            }

        }
    }, containerColor = MaterialTheme.colorScheme.onBackground)
}


@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewMovieDetailScreen() {
    MovieDetailScreen()

}