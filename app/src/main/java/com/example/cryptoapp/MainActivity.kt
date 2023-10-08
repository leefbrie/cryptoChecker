package com.example.cryptoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                
                MainContainer()
            }
        }
    }
}


@Composable
fun MainContainer() {

    Column(
        modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CryptoCard("Bitcoin", "Btc", R.drawable.bitcoin)
    }
}

@Composable
fun CryptoCard(
    item: String, symbol: String, icon: Int
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

            Image(
                painter = painterResource(id = icon),
                contentDescription = "crypto icon",
                modifier = Modifier.size(48.dp)
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
