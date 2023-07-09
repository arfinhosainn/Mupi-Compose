package com.arfin.mupicompose.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arfin.mupicompose.data.dto.toMovies
import com.arfin.mupicompose.domain.repository.MovieRepository
import com.arfin.mupicompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val movieRepository: MovieRepository
) : ViewModel() {

    private val _movieList = MutableStateFlow(HomeScreenState())
    val movieList get() = _movieList

    init {
        viewModelScope.launch {
            getMovieList()
        }
    }

    private suspend fun getMovieList() {
        movieRepository.fetchMovieList(LIST_ID, API_KEY).collect { result ->
            when (result) {
                is Resource.Success -> {
                    _movieList.value =
                        HomeScreenState(movies = result.data?.items?.map { it.toMovies() }
                            ?: emptyList())
                    Log.d(TAG, "getMovieList: ${result.data?.items}")
                }

                is Resource.Error -> {
                    _movieList.value = HomeScreenState(
                        error = result.message
                    )
                }

                is Resource.Loading -> {
                    _movieList.value = HomeScreenState(
                        isLoading = true
                    )
                }
            }
        }
    }

    companion object {
        const val TAG = "HomeViewModel"
        const val API_KEY = "8b5740b0fde20cc6f7c8da84eaebbd92"
        const val LIST_ID = "8258091"
    }


}