package com.arfin.mupicompose.presentation.home.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arfin.mupicompose.R

@Composable
fun SectionHeader(
    headerText: String,
    modifier: Modifier = Modifier
) {

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp, start = 30.dp, end = 30.dp, bottom = 15.dp)) {
        Text(
            text = headerText,
            modifier = Modifier
                .width(138.dp)
                .height(30.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.kumbh_sans_medium)),
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF),
            )
        )

    }
}


