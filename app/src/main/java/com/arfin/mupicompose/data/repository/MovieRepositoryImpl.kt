package com.arfin.mupicompose.data.repository

import com.arfin.mupicompose.data.dto.MovieInfo
import com.arfin.mupicompose.data.dto.QueryResponse
import com.arfin.mupicompose.data.dto.toMovies
import com.arfin.mupicompose.data.remote.MovieService
import com.arfin.mupicompose.domain.model.Movies
import com.arfin.mupicompose.domain.repository.MovieRepository
import com.arfin.mupicompose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieService
) : MovieRepository {
    override fun fetchMovieList(listId: String, apiKey: String): Flow<Resource<Movies>> =
        flow {
            try {
                emit(Resource.Loading())
                val response = api.getMovieList(listId, apiKey).toMovies()
                emit(Resource.Success(response))
            } catch (e: Exception) {
                emit(Resource.Error(""))
            }
        }

    override fun fetchMovieByQuery(movie: String, apiKey: String): Flow<QueryResponse> {
        TODO("Not yet implemented")
    }

    override fun fetchMovieDetails(movieId: String, apiKey: String): Flow<MovieInfo> {
        TODO("Not yet implemented")
    }
}