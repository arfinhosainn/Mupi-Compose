package com.arfin.mupicompose.presentation.hall.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arfin.mupicompose.presentation.hall.HallUiState
import kotlin.random.Random

@Composable
fun SeatsSection(onSeatClick:(String)->Unit) {
    Column(
        Modifier
            .background(Color.Black)
    ) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            userScrollEnabled = false
        ) {
            itemsIndexed(generateSeatList()) { index, seat ->
                val rotateAngle = if (index % 3 == 0) 15f else if (index % 3 == 2) -15f else 0f
                SeatSet(
                    onSeatClick = onSeatClick,
                    seatSet = seat,
                    modifier = Modifier
                        .rotate(rotateAngle)
                        .padding(vertical = 8.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SeatSectionPreview() {
    SeatsSection({})
}

fun generateSeatList(): List<Pair<HallUiState.Seat, HallUiState.Seat>> {
    val seats = mutableListOf<HallUiState.Seat>()
    val random = Random.Default

    for (j in 'a'..'o') {
        seats.add(HallUiState.Seat("$j/1", random.nextBoolean()))

        seats.add(HallUiState.Seat("$j/2", random.nextBoolean()))
    }


    return seats.chunked(2) { (first, second) -> Pair(first, second) }
}