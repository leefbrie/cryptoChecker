package com.example.cryptoapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun DetailScreen(
    navController: NavController,
    string: Any?
) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Cyan)
    ) {
        Text(
            text = "test "
        )
    }
}