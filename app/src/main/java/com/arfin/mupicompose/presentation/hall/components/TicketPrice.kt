package com.arfin.mupicompose.presentation.hall.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.arfin.mupicompose.R

@Composable
fun MovieTicketPrice(numnberOfTickets: Int) {
    Column() {
        Text(
            text = "$" + "%.2f".format(numnberOfTickets * 25.0),
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
            letterSpacing = 1.3.sp,
            color = Color.Black.copy(alpha = .87f)
        )
        Text(
            text = "$numnberOfTickets " + stringResource(id = R.string.tickets),
            color = Color(0xFFB5B5B5)
        )
    }
}

@Preview
@Composable
fun MovieTicketPricePreview() {
    MovieTicketPrice(4)
}