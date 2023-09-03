package com.example.cryptoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import model.CryptoInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val apiKey = "e4905cdd-b108-46fa-9879-1cd3b85b5998"


        val call: Call<List<CryptoInfo>> = api.getCryptoList(apiKey)
        call.enqueue(object : Callback<CryptoInfo> {
            override fun onResponse(
                call: Call<CryptoInfo>,
                response: Response<CryptoInfo>
            ) {
                if (response.isSuccessful) {
                    val cryptoList = response.body()?.data
                    // Process the cryptoList here
                } else {
                    // Handle the error
                }
            }

            override fun onFailure(call: Call<CryptoListResponse>, t: Throwable) {
                // Handle the failure here
            }
        })

        setContent {
            CryptoCard()
        }
    }
}

@Composable
fun CryptoCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = Color.Blue)
    ) {
        Text(
            text = "Hello, I am a Bitcoin",
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}
