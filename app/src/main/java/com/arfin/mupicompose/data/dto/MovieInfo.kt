package com.arfin.mupicompose.data.dto

import com.arfin.mupicompose.domain.model.MovieDetails

data class MovieInfo(
    val adult: Boolean,
    val backdrop_path: String,
    val belongs_to_collection: BelongsToCollection,
    val budget: Int,
    val genres: List<Genre>,
    val homepage: String,
    val id: Int,
    val imdb_id: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val production_companies: List<ProductionCompany>,
    val production_countries: List<ProductionCountry>,
    val release_date: String,
    val revenue: Int,
    val runtime: Int,
    val spoken_languages: List<SpokenLanguage>,
    val status: String,
    val tagline: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
) {
    fun MovieInfo.toMovieDetails(): MovieDetails {
        return MovieDetails(
            backdrop_path = backdrop_path,
            genres = genres,
            id = id,
            overview = overview,
            poster_path = poster_path,
            runtime = runtime,
            tagline = tagline,
            title = title,
            video = video
        )
    }

}

