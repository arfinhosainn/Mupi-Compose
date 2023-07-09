package com.arfin.mupicompose.data.dto

import com.arfin.mupicompose.domain.model.Movies
import com.google.gson.annotations.SerializedName

data class MovieList(
    val created_by: String,
    val description: String,
    val favorite_count: Int,
    val id: String,
    val iso_639_1: String,
    val item_count: Int,
    @SerializedName("items")
    val movies: List<Movie>,
    val name: String,
    val poster_path: Any
)

fun MovieList.toMovies(): Movies {
    return Movies(
        created_by = created_by,
        description = description,
        favorite_count = favorite_count,
        id = id,
        item_count = item_count,
        movies = movies,
        name = name,
        poster_path = poster_path
    )
}
