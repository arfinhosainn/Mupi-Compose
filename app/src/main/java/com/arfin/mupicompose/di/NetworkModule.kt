package com.arfin.mupicompose.di

import com.arfin.mupicompose.data.remote.MovieService
import com.arfin.mupicompose.data.repositoryimpls.MovieRepositoryImpl
import com.arfin.mupicompose.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideMovieService(): MovieService {
        return Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(MovieService::class.java)
    }

    @Provides
    @Singleton
    fun providesMovieRepository(api: MovieService): MovieRepository {
        return MovieRepositoryImpl(api)
    }

}