package com.arfin.mupicompose.presentation.ticket.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arfin.mupicompose.R

@Composable
fun EntryTicket(
    movieName: String,
    movieDate: String,
    seatNumber: String,
    hallLocation: String,
    movieTime: String,
    paymentStatus: String,
    orderNumber: String
) {
    Card(
        modifier = Modifier
            .height(444.dp)
            .width(315.dp)
            .graphicsLayer {
                compositingStrategy = CompositingStrategy.Offscreen
            }
            .drawWithCache {
                val path = Path()
                path.addRect(
                    Rect(
                        topLeft = Offset.Zero,
                        bottomRight = Offset(size.width, size.height)
                    )
                )
                onDrawWithContent {
                    clipPath(path) {
                        // this draws the actual image - if you don't call drawContent, it wont
                        // render anything
                        this@onDrawWithContent.drawContent()
                    }
                    val dotSize = size.width / 15f
                    // Clip a white border for the content
                    drawCircle(
                        Color.Black,
                        radius = dotSize,
                        center = Offset(size.width - dotSize / 2, size.height / 1.4f),
                        blendMode = BlendMode.Clear
                    )
                    drawCircle(
                        Color.Black,
                        radius = dotSize,
                        center = Offset(dotSize / 2, size.height / 1.4f),
                        blendMode = BlendMode.Clear
                    )
                }

            }, colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 34.dp,
                    vertical = 34.dp
                ), horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = movieName,
                    modifier = Modifier
                        .width(135.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = "e-ticket",
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF14763),
                    )
                )
                Spacer(modifier = Modifier.height(35.dp))

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Date",
                    modifier = Modifier
                        .width(135.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF717171),
                    )
                )
                Text(
                    text = "Seats",
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF717171),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = movieDate,
                    modifier = Modifier
                        .width(135.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = seatNumber,
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Location",
                    modifier = Modifier
                        .width(135.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF717171),
                    )
                )
                Text(
                    text = "Time",
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF717171),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = hallLocation,
                    modifier = Modifier
                        .width(135.dp)
                        .height(40.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = movieTime,
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Payment",
                    modifier = Modifier
                        .width(135.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF717171),
                    )
                )
                Text(
                    text = "Order",
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF717171),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = paymentStatus,
                    modifier = Modifier
                        .width(135.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Text(
                    text = orderNumber,
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
            Spacer(modifier = Modifier.height(45.dp))
            DottedLine()
        }
    }
}

@Composable
fun DottedLine() {
    val pathEffect = PathEffect.dashPathEffect(floatArrayOf(14f, 14f), 0f)
    Canvas(
        Modifier
            .fillMaxWidth()
            .height(1.dp)
    ) {
        drawLine(
            color = Color.Black,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            strokeWidth = 4f,
            pathEffect = pathEffect
        )
    }
}


@Preview
@Composable
fun PreviewEntryTicket() {
    EntryTicket(
        movieName = "Fast & Furious",
        movieDate = "10/9/2023",
        seatNumber = "f6,h8",
        movieTime = "10:30 PM",
        hallLocation = "Jamuna, Blockbuster",
        paymentStatus = "Successful",
        orderNumber = "223945"
    )
}
