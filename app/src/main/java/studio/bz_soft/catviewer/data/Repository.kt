package studio.bz_soft.catviewer.data

import studio.bz_soft.catviewer.data.http.ApiClientInterface
import studio.bz_soft.catviewer.data.models.BreedModel
import studio.bz_soft.catviewer.data.models.CategoriesModel
import studio.bz_soft.catviewer.root.extensions.IO
import studio.bz_soft.catviewer.root.extensions.io

class Repository(
    private val client: ApiClientInterface
) : RepositoryInterface {

    override suspend fun getListOfBreeds(api: String): IO<List<BreedModel>, Exception> =
            io { client.getListOfBreeds(api) }

    override suspend fun getListOfCategories(api: String): IO<List<CategoriesModel>, Exception> =
            io { client.getListOfCategories(api) }
}