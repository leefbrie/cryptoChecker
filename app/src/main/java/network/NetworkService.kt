import network.CoinMarketCapApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val retrofit = Retrofit.Builder()
    .baseUrl("https://pro-api.coinmarketcap.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

public val api = retrofit.create(CoinMarketCapApi::class.java)