package com.arfin.mupicompose.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.arfin.mupicompose.presentation.home.HomeScreen
import com.arfin.mupicompose.presentation.search.SearchScreen

@Composable
fun SetupNavGraph(
    startDestination: String,
    navController: NavHostController,
) {
    NavHost(startDestination = startDestination, navController = navController) {
        homeRoute(
            navigateToSearch = {
                navController.navigate(Screen.Search.route)
            }
        )
        searchRoute()
    }

}

fun NavGraphBuilder.homeRoute(
    navigateToSearch: () -> Unit
) {
    composable(route = Screen.Home.route) {
        HomeScreen(navigateToSearch = navigateToSearch)
    }
}


fun NavGraphBuilder.searchRoute(
) {
    composable(route = Screen.Search.route) {
        SearchScreen()
    }
}