import model.CryptoInfo
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query


interface CryptoService {
    @GET("/cryptocurrency/*")
    fun getCryptoList(@Query("apiKey") apiKey: String): Call<List<CryptoInfo>>
}


class CryptoApi: CryptoService{

    private val key  = "e4905cdd-b108-46fa-9879-1cd3b85b5998"


  //setup the retrofit builder
    init{
      val retrofit = Retrofit.Builder()
          .baseUrl("https://pro-api.coinmarketcap.com/")
          .addConverterFactory(GsonConverterFactory.create())
          .build()

          val api = retrofit.create(CryptoService::class.java)

    }

    override fun getCryptoList(apiKey: String): Call<List<CryptoInfo>> {
        TODO("Not yet implemented")
    }
}

val api = CryptoApi()


