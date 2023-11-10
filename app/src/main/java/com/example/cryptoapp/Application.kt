package com.example.cryptoapp

import android.app.Application
import com.example.cryptoapp.data.remote.ApiRepository
import com.example.cryptoapp.data.remote.ApiBuilder


class MyApplication: Application() {
    lateinit var homeRepository : ApiRepository
        private set

    override fun onCreate() {
        super.onCreate()
        val apiBuilder = ApiBuilder
        val apiRepository = ApiRepository(apiBuilder.coinMarketApi)
        homeRepository = apiRepository
    }
}