package com.arfin.mupicompose.presentation.search

import com.arfin.mupicompose.domain.model.Movies

data class SearchScreenState(
    val isLoading: Boolean = false,
    val movies: List<Movies> = emptyList(),
    val error: String? = null
)