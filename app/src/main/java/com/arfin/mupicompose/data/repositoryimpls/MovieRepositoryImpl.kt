package com.arfin.mupicompose.data.repositoryimpls

import com.arfin.mupicompose.data.dto.MovieInfo
import com.arfin.mupicompose.data.dto.MovieListDto
import com.arfin.mupicompose.data.dto.QueryResponse
import com.arfin.mupicompose.data.remote.MovieService
import com.arfin.mupicompose.domain.repository.MovieRepository
import com.arfin.mupicompose.util.Exceptions
import com.arfin.mupicompose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieService
) : MovieRepository {
    override fun fetchMovieList(listId: String, apiKey: String):Flow<Resource<MovieListDto>> =
        flow {
            try {
                emit(Resource.Loading())
                val response = api.getMovieList(listId, apiKey)
                emit(Resource.Success(response))
            } catch (e: Exceptions.NetworkException) {
                emit(Resource.Error("${e.message}"))
            } catch (e: Exceptions.UnknownErrorException) {
                emit(Resource.Error("${e.message}"))
            }
        }

    override fun fetchMovieByQuery(movie: String, apiKey: String): Flow<QueryResponse> = flow {

    }

    override fun fetchMovieDetails(movieId: String, apiKey: String): Flow<MovieInfo> = flow {

    }
}