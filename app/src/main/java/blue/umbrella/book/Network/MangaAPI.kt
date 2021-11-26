package blue.umbrella.book.Network

import blue.umbrella.book.Network.Model.Trending
import retrofit2.Call
import retrofit2.http.GET

interface MangaAPI {

    @GET("manga")
    fun getManga() : Call<Response>

    @GET("trending/manga")
    fun getTrending() : Call<Trending>

}