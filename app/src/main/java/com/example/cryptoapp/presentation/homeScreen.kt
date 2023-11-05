package com.example.cryptoapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.cryptoapp.R


@Composable
fun MainScreen(
    navController: NavController
) {
    val viewModel: HomeViewModel = viewModel(factory = HomeViewModel.Factory)

    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CryptoCard("test", "test,", navController)
    }
}

@Composable
fun CryptoCard(
    item: String,
    symbol: String,
    navController: NavController
) {
    Card(
        shape = RoundedCornerShape(8.dp), modifier = Modifier.fillMaxWidth(0.8f)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = item,
                    color = colorResource(id = R.color.black),
                )

                Text(
                    text = symbol,
                    color = colorResource(id = R.color.black),
                )


            }
        }
    }
}