package studio.bz_soft.catviewer.data.http

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import studio.bz_soft.catviewer.data.models.BreedModel
import studio.bz_soft.catviewer.data.models.CategoriesModel

interface CatApiInterface {

    @GET("breeds")
    fun listOfBreeds(@Header("X-Api-Key") api: String) : Call<List<BreedModel>>

    @GET("images/search?breed_id=")
    fun catByBreed(@Header("X-Api-Key") api: String) : Call<BreedModel>

    @GET("categories")
    fun listOfCategories(@Header("X-Api-Key") api: String) : Call<List<CategoriesModel>>
}