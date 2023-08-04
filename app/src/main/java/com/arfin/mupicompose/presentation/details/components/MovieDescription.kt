package com.arfin.mupicompose.presentation.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arfin.mupicompose.R


@Composable
fun MovieDescription(
    movieName: String,
    movieDirector: String,
    movieGenre: String,
    movieOverview: String,
    buyTicket: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp)
            .background(color = MaterialTheme.colorScheme.onBackground),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = movieName,
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                fontWeight = FontWeight(500),
                color = Color(0xFFFFFFFF),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(123.dp)
                .height(30.dp)
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = movieDirector,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                    fontWeight = FontWeight(300),
                    color = Color(0xFFBABFC9),
                    letterSpacing = 0.14.sp,
                )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .width(74.dp)
                    .height(29.dp), colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF252932)
                )
            ) {
                Text(
                    text = "Action",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB2B5BB),
                        letterSpacing = 0.14.sp,
                    )
                )

            }
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .width(74.dp)
                    .height(29.dp), colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF252932)
                )
            ) {
                Text(
                    text = "Action",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB2B5BB),
                        letterSpacing = 0.14.sp,
                    )
                )

            }
            Button(
                onClick = {  }, modifier = Modifier
                    .width(74.dp)
                    .height(29.dp), colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF252932)
                )
            ) {
                Text(
                    text = "Action",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFB2B5BB),
                        letterSpacing = 0.14.sp,
                    )
                )

            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Synopsis",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                fontWeight = FontWeight(500),
                color = Color(0xFFFFFFFF),
                letterSpacing = 0.2.sp,
            ),
            modifier = Modifier
                .width(92.dp)
                .height(30.dp)
        )
        Text(
            text = movieOverview,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 22.sp,
                fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                fontWeight = FontWeight(300),
                color = Color(0xFF696D74),
                textAlign = TextAlign.Justify,
                letterSpacing = 0.07.sp,
            )
        )
        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = buyTicket, modifier = Modifier
                    .width(315.dp)
                    .height(57.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF54A8E5)
                )
            ) {
                Text(
                    text = "Buy Ticket",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.14.sp,
                    )
                )

            }


        }
    }
}


//@Preview
//@Composable
//fun PreviewMovieDescription() {
//    MovieDescription()
//
//}