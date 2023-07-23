package com.arfin.mupicompose.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arfin.mupicompose.R

@Composable
fun HomeHeader() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(5f)) {
            Text(
                text = "Welcome Back,",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFAFAFAF),
                )
            )
            Text(
                text = "Andri Setiawan",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.18.sp,
                )
            )
        }

        Image(
            modifier = Modifier
                .padding(0.dp)
                .width(48.dp)
                .height(48.dp),
            painter = painterResource(id = R.drawable.image_1),
            contentDescription = "image description",
            contentScale = ContentScale.None
        )

    }

}


@Preview
@Composable
fun PreviewHomeHeader() {
    HomeHeader()

}

