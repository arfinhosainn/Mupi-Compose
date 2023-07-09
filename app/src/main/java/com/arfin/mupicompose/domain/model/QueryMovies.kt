package com.arfin.mupicompose.domain.model

import com.arfin.mupicompose.data.dto.MoviesDto
import com.google.gson.annotations.SerializedName

data class QueryMovies(
    val page: Int,
    @SerializedName("results")
    val results: List<MoviesDto>,
    val total_pages: Int,
    val total_results: Int
)
