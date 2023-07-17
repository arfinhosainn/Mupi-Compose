package com.arfin.mupicompose.presentation.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.arfin.mupicompose.domain.model.Movies
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    onTextChange: (String) -> Unit,
    onMovieClick: (Movies) -> Unit
) {

    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(false) }

    DockedSearchBar(query = text, onQueryChange = {
        text = it
        onTextChange(it)
    }, onSearch = {
        onTextChange(text)
    }, active = active,
        onActiveChange = {
            active = it
        },
        placeholder = { Text(text = "Search Episodes") },
        trailingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "Search Icon"
            )
        })
    {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
           ListItem(
               headlineContent = {
                   Text(text = )
               }
           )

        }

    }


}