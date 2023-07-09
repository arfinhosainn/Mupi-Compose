package com.arfin.mupicompose.domain.repository

import com.arfin.mupicompose.data.dto.MovieInfo
import com.arfin.mupicompose.data.dto.MovieListDto
import com.arfin.mupicompose.data.dto.QueryResponse
import com.arfin.mupicompose.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun fetchMovieList(listId: String, apiKey: String): Flow<Resource<MovieListDto>>
    fun fetchMovieByQuery(movie: String, apiKey: String): Flow<QueryResponse>
    fun fetchMovieDetails(movieId: String, apiKey: String): Flow<MovieInfo>
}