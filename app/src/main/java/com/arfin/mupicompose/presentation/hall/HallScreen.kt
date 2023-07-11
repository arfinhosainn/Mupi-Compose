package com.arfin.mupicompose.presentation.hall

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arfin.mupicompose.presentation.hall.components.HallProjector
import com.arfin.mupicompose.presentation.hall.components.MovieTicketPrice
import com.arfin.mupicompose.presentation.hall.components.SeatIndicatorSection
import com.arfin.mupicompose.presentation.hall.components.SeatsSection


@Composable
fun HallScreen() {

}


@Composable
fun HallContent(
    onCloseClick: () -> Unit,
    onSeatClick: (String) -> Unit,
    @DrawableRes backDropImageRes: Int,
    numberOfTickets: Int
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.Black
            )
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            HallProjector(backDropImageRes = backDropImageRes)
            SeatsSection(onSeatClick = onSeatClick)
            Spacer(modifier = Modifier.height(24.dp))
            SeatIndicatorSection()
            Spacer(modifier = Modifier.height(24.dp))
        }
        Box(Modifier.clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))) {
            MovieTicketPrice(numberOfTickets)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CinemaHallPreview() {
    HallContent({}, onSeatClick = {}, 0, 4)
}