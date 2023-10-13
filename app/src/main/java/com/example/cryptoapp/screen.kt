package com.example.cryptoapp

sealed class Screen( val route: String){
    object Mainscreen : Screen("main_screen")
    object AlertScreen : Screen("alert_screen")
}
