package com.example.cryptoapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cryptoapp.Screen

@Composable
fun DetailScreen(
    navController: NavController,
    id: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            text = "dit is kaartje nummer $id",
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
        Button(onClick = {
            navController.navigate(Screen.Mainscreen.route)
        }) {
            Text(text = "ga weer terug")
        }
    }
}
    
