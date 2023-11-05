package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.model.ApiResponse
import com.example.cryptoapp.data.model.Product
import testApi.Apicoins
import testApi.ApiBuilder

class ApiRepository(private val apiBuilder: Apicoins) {
    suspend fun fetchCryptoData(): List<ApiResponse> {
        return apiBuilder.getCrypto()
    }
}