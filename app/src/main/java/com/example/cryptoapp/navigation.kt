package com.example.cryptoapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.cryptoapp.presentation.MainScreen
import com.example.cryptoapp.presentation.DetailScreen

@Composable
fun navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Mainscreen.route) {
        composable(route = Screen.Mainscreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = "${Screen.Detailscreen.route}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            val id = arguments.getInt("id")
            DetailScreen(navController = navController, id)

        }

    }
}