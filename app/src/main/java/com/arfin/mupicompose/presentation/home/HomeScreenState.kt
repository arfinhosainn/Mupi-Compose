package com.arfin.mupicompose.presentation.home

import com.arfin.mupicompose.domain.model.Movies

data class HomeScreenState(
    val isLoading: Boolean = false,
    val movies: List<Movies> = emptyList(),
    val error: String? = null
)