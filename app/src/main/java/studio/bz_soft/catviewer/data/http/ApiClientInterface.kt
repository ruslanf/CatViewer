package studio.bz_soft.catviewer.data.http

import studio.bz_soft.catviewer.data.models.BreedModel
import studio.bz_soft.catviewer.data.models.CategoriesModel

interface ApiClientInterface {

    suspend fun getListOfBreeds(api: String) : List<BreedModel>

    suspend fun getListOfCategories(api: String) : List<CategoriesModel>
}