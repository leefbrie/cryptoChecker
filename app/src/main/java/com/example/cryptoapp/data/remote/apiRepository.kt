package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.model.ApiResponse
import com.example.cryptoapp.data.model.Product
import retrofit2.Call
import testApi.Apicoins
import testApi.ApiBuilder

class ApiRepository(private val apiBuilder: Apicoins) {
    suspend fun fetchCryptoData() : ApiResponse {
        return apiBuilder.getCrypto()
    }
}