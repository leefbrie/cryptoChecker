package testApi

import com.example.cryptoapp.data.model.ApiResponse
import com.example.cryptoapp.data.model.Product
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface Apicoins {
    @GET("products")
    suspend fun getCrypto(): ApiResponse

    @GET("products/{id}")
    suspend fun getOneCrypto(@Path("id") id : Product): List<ApiResponse>

}
object ApiBuilder {
    val retrofit = Retrofit.Builder().baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()
    val coinMarketApi: Apicoins = retrofit.create(Apicoins::class.java)
}





