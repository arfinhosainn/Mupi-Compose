package com.arfin.mupicompose.presentation.search.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.arfin.mupicompose.domain.model.Movies
import com.arfin.mupicompose.presentation.search.SearchScreenState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    onTextChange: (String) -> Unit,
    onMovieClick: (Movies) -> Unit,
    searchState: SearchScreenState,
) {

    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(true) }

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
        LazyColumn(modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(16.dp)) {
            items(searchState.movies) { movies ->
                ListItem(headlineContent = { Text(text = "${movies.title}") },
                    supportingContent = { Text(text = "${movies.popularity}") },
                    leadingContent = {
                        AsyncImage(
                            model = movies.poster_path, contentDescription = "movie poster",
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .size(70.dp)
                        )
                    },
                    modifier = Modifier.clickable {
                        onMovieClick(movies)
                        active = false
                    }, colors = ListItemDefaults.colors(containerColor = Color.Green))
            }
        }
    }
}


//@Preview
//@Composable
//fun PreviewSearchBar() {
//    SearchBar(onTextChange = {}, onMovieClick = {}, searchState = SearchScreenState(), onNavigate = NavController )
//
//}