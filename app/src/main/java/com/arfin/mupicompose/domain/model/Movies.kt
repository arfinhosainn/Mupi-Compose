package com.arfin.mupicompose.domain.model

import com.arfin.mupicompose.data.dto.Movie
import com.google.gson.annotations.SerializedName

data class Movies(
    val created_by: String,
    val description: String,
    val favorite_count: Int,
    val id: String,
    val item_count: Int,
    @SerializedName("items")
    val movies: List<Movie>,
    val name: String,
    val poster_path: Any

)
