package com.example.cryptoapp.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.cryptoapp.R
import com.example.cryptoapp.Screen


@Composable
fun MainScreen(
    navController: NavController
) {
    val viewModel: HomeViewModel = viewModel(factory = HomeViewModel.Factory)
    val state = viewModel.uiState.collectAsState()
    Log.d("hallo", "$state")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image =  painterResource(R.drawable.ic_polkadot)
        for (i in 1..4) {
            CryptoCard( "Bitcoin", "BTC", navController)
            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )
        }
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
                .clickable {
                    navController.navigate(Screen.AlertScreen.route)}
                .background(color = Color.White)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(16.dp))

            Icon(
                painter = painterResource(R.drawable.ic_polkadot),
                contentDescription = "icon",
                modifier = Modifier.background(Color.Gray)
                    .size(48.dp)
            )
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