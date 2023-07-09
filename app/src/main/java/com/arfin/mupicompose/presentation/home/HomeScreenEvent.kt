package com.arfin.mupicompose.presentation.home

sealed interface OneTimeEvent {
    data class ShowToast(val message: String) : OneTimeEvent
    data class ShowSnackbar(val message: String) : OneTimeEvent
}