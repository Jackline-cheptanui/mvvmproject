package ApIpackage

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApIClient {
    var retofit = Retrofit.Builder()
        .baseUrl("<your base url goes here>")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> buildApiClient(apiInterface: Class<T>): T {
        return retofit.create(apiInterface)



    }
}
