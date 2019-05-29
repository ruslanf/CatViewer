package studio.bz_soft.catviewer.data

import studio.bz_soft.catviewer.data.models.BreedModel
import studio.bz_soft.catviewer.data.models.CategoriesModel
import studio.bz_soft.catviewer.root.extensions.IO

interface RepositoryInterface {

    suspend fun getListOfBreeds(api: String): IO<List<BreedModel>, Exception>

    suspend fun getListOfCategories(api: String): IO<List<CategoriesModel>, Exception>
}