package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.model.ApiResponse

class ApiRepository(private val apiBuilder: Apicoins) {
    suspend fun fetchCryptoData() : List<ApiResponse> {
        return apiBuilder.getCrypto()
    }
}