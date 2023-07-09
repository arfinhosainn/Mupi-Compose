package com.arfin.mupicompose.data.dto

import com.arfin.mupicompose.domain.model.QueryMovies
import com.google.gson.annotations.SerializedName

data class QueryResponse(
    val page: Int,
    @SerializedName("results")
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
) {
    fun QueryResponse.toQueryMovies(): QueryMovies {
        return QueryMovies(
            page = page,
            results = results,
            total_pages = total_pages,
            total_results = total_results
        )
    }
}