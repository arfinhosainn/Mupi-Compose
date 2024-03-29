package com.arfin.mupicompose.data.dto

import com.arfin.mupicompose.domain.model.Movies
import com.google.gson.annotations.SerializedName


data class MoviesDto(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String?,
    val overview: String?,
    val popularity: Double,
    val poster_path: String,
    val release_date: String?,
    val title: String,
    val video: Boolean?,
    val vote_average: Double,
    val vote_count: Int
)

fun MoviesDto.toMovies(): Movies {
    return Movies(
        backdrop_path = backdrop_path,
        id = id,
        original_title = original_title,
        popularity = popularity,
        overview = overview,
        poster_path = poster_path,
        release_date = release_date,
        title = title,
        video = video
    )
}