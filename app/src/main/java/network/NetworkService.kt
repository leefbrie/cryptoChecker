package testApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import model.CryptoInfo
import retrofit2.http.GET



interface Apicoins {
    @GET("pproducts")
    suspend fun getCrypto(): List<CryptoInfo>
}

class Apirepository(){
    fun startup() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val coinMarketApi = retrofit.create(Apicoins::class.java)
    }


}




