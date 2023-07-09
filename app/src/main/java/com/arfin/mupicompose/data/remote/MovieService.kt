package com.arfin.mupicompose.data.remote

import com.arfin.mupicompose.data.dto.MovieInfo
import com.arfin.mupicompose.data.dto.MovieListDto
import com.arfin.mupicompose.data.dto.QueryResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("list/{list_id}")
    suspend fun getMovieList(
        @Path("list_id") listId: String,
        @Query("api_key") apiKey: String
    ): MovieListDto

    @GET("search/movie")
    suspend fun searchMovie(
        @Query("query") movie: String,
        @Query("api_key") apiKey: String
    ): QueryResponse

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: String,
        @Query("api_key") apiKey: String
    ): MovieInfo

}