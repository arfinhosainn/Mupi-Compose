package com.arfin.mupicompose.domain.model

import com.arfin.mupicompose.data.dto.BelongsToCollection
import com.arfin.mupicompose.data.dto.Genre
import com.arfin.mupicompose.data.dto.ProductionCompany
import com.arfin.mupicompose.data.dto.ProductionCountry
import com.arfin.mupicompose.data.dto.SpokenLanguage

data class MovieDetails(
    val backdrop_path: String,
    val genres: List<Genre>,
    val id: Int,
    val overview: String,
    val poster_path: String,
    val runtime: Int,
    val tagline: String,
    val title: String,
    val video: Boolean,
)
