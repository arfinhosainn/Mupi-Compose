package com.arfin.mupicompose.presentation.hall

import androidx.annotation.DrawableRes
import java.time.LocalDate
import java.time.LocalTime

data class HallUiState(
//    @DrawableRes val movieBackDropImageRes: Int =
    val movieBookingDate: MovieBookingDate = MovieBookingDate(),
    val seats: List<Seat> = emptyList()
) {
    data class MovieBookingDate(
        val availableDays: List<LocalDate> = emptyList(),
        val availableTime: List<LocalTime> = emptyList(),
    )

    data class Seat(val id: String = "", val isTaken: Boolean = false)
}

