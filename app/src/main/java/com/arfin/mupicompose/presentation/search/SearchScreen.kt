package com.arfin.mupicompose.presentation.search

import androidx.compose.runtime.Composable
import com.arfin.mupicompose.presentation.search.components.SearchBar

@Composable
fun SearchScreen(
) {
    SearchBar(onTextChange = {}, onMovieClick = {}, searchState = SearchScreenState())

}