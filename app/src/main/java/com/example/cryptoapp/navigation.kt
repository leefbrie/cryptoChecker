package com.example.cryptoapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import vieuw.DetailScreen

@Composable
fun navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Mainscreen.route){
        composable(route = Screen.Mainscreen.route){
            MainScreen(navController = navController )
        }
        composable(route = Screen.AlertScreen.route){
            DetailScreen(navController = navController)
        }
    }
}