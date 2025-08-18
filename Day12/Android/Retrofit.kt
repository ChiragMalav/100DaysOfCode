//Main Activity
val retrofitService = RetrofitInstance().getRetrofitInstance().create(AlbumService::class.java)

        val responseLiveData : LiveData<retrofit2.Response<Albums>> =
            liveData {
                val response = retrofitService.getAlbums()
                emit(response)
            }


        responseLiveData.observe(this,{
                val albumList = it.body()?.listIterator()
                if(albumList!=null){
                    while(albumList.hasNext()){
                        val albumItem = albumList.next()
                        val albumTitle = "Album Title : ${albumItem.title} \n"
                        binding.tvTitle.append(albumTitle)
                    }

                }
        })


//Retrofit Instance
class RetrofitInstance {
    val mainURL = "https://jsonplaceholder.typicode.com/"

    fun getRetrofitInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(mainURL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }
}

//Interface
interface AlbumService {
    @GET("/albums")
    suspend fun getAlbums() : Response<Albums>
}

//data class
data class AlbumItems(
    @SerializedName("id")
    val id : Int,
    @SerializedName("userId")
    val userId : Int,
    @SerializedName("title")
    val title : String
)

//Albums
class Albums : ArrayList<AlbumItems>() {

}
