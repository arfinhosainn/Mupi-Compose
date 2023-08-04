package com.arfin.mupicompose.presentation.details.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.arfin.mupicompose.R

@Composable
fun MovieDetailCard(
    modifier: Modifier = Modifier,
    width: Dp,
    height: Dp,
    imageRes: String,
    onImageClick: () -> Unit
) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {

        AsyncImage(
            model = imageRes, contentDescription = "Movie Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(32.dp))
                .size(width = width, height = height)
                .clickable { onImageClick() }
                .then(modifier)
                .fillMaxWidth(fraction = 0.85f),
        )
    }
}

@Preview
@Composable
fun MovieCardPreview() {
    MovieDetailCard(
        width = 190.dp,
        height = 270.dp,
        imageRes = "https://m.media-amazon.com/images/M/MV5BMjMyOTM4MDMxNV5BMl5BanBnXkFtZTcwNjIyNzExOA@@._V1_.jpg"
    ) {}
}