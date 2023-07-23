package com.arfin.mupicompose.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SearchBarPlaceHolder(
    navigateToSearch: () -> Unit
) {

    val text by remember {
        mutableStateOf("")

    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            value = text, onValueChange = {}, enabled = false, modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)
                .background(
                    color = Color(0xFF2C3759),
                    shape = RoundedCornerShape(size = 27.dp)
                )
                .clickable(onClick = navigateToSearch),
            placeholder = {
                Text(text = "Search your favorite movie")
            }, shape = RoundedCornerShape(12.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
            }, colors = TextFieldDefaults.colors(focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent)
        )

    }


}
//
//@Preview
//@Composable
//fun PreviewFakeSearchBar() {
//    SearchBarPlaceHolder()
//
//}