package network

import model.CryptoInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface CryptoService {
    @GET("/cryptocurrency/*")
    fun getCryptoList(@Query("apiKey") apiKey: String): Call<List<CryptoInfo>>
}
