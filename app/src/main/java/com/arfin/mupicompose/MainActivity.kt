package com.arfin.mupicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.arfin.mupicompose.presentation.home.HomeScreen
import com.arfin.mupicompose.presentation.navigation.Screen
import com.arfin.mupicompose.presentation.navigation.SetupNavGraph
import com.arfin.mupicompose.ui.theme.MupiComposeTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MupiComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    SetupNavGraph(
                        startDestination = Screen.Home.route,
                        navController = navController
                    )
                }
            }
        }
    }
}
