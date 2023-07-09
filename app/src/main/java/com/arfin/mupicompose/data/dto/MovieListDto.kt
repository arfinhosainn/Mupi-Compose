package com.arfin.mupicompose.data.dto

import com.google.gson.annotations.SerializedName

data class MovieListDto(
    val created_by: String,
    val description: String,
    val favorite_count: Int,
    val id: String,
    val iso_639_1: String,
    val item_count: Int,
    @SerializedName("items")
    val items: List<MoviesDto>,
    val name: String,
    val poster_path: Any
)
