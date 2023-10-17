package com.example.cryptoapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.cryptoapp.Screen

@Composable
fun DetailScreen(
    navController: NavController
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