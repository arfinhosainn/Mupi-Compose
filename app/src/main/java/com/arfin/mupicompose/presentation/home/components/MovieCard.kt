package com.arfin.mupicompose.presentation.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MovieCard(
    modifier: Modifier = Modifier,
    width: Dp,
    height: Dp,
    imageRes: String,
    onImageClick: () -> Unit
) {
    AsyncImage(
        model = imageRes, contentDescription = "Movie Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(RoundedCornerShape(32.dp))
            .size(width = width, height = height)
            .clickable { onImageClick() }
            .then(modifier).fillMaxWidth(fraction = 0.85f),
    )
}

@Preview
@Composable
fun MovieCardPreview() {
    MovieCard(width = 264.dp, height = 400.dp, imageRes = "") {}
}