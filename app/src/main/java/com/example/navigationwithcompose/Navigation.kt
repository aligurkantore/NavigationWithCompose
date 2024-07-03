package com.example.navigationwithcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationwithcompose.ui.screens.FirstScreen
import com.example.navigationwithcompose.ui.screens.SecondScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "firstFragment") {
        composable("firstFragment") {
            FirstScreen(navController = navController)
        }
        composable("secondFragment/{data}") { backStackEntry ->
            val data = backStackEntry.arguments?.getString("data")
            SecondScreen(data = data ?: "", navController = navController)
        }
    }
}



