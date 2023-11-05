package com.example.cryptoapp.presentation


import com.example.cryptoapp.MyApplication
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.cryptoapp.data.model.ApiResponse
import com.example.cryptoapp.data.remote.ApiRepository

import com.example.cryptoapp.presentation.state.CryptoState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class HomeViewModel(private val apiRepository: ApiRepository) : ViewModel() {

    private val _uiState = MutableStateFlow<CryptoState>(CryptoState())
    val uiState: StateFlow<CryptoState> = _uiState.asStateFlow()

    fun loadCrypto() = viewModelScope.launch(Dispatchers.IO) {
        val latestCryptoList = getCryptoList()
    }

    private suspend fun getCryptoList(): List<ApiResponse> {
        return apiRepository.fetchCryptoData()
    }

    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                val application = checkNotNull(extras[APPLICATION_KEY])


                return HomeViewModel(
                    (application as MyApplication).homeRepository

                ) as T
            }
        }
    }
}

