package blue.umbrella.book.Network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Config {

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit
        .Builder()
        .baseUrl("https://kitsu.io/api/edge/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun getManga() = retrofit.create(MangaAPI::class.java)

}