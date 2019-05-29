package studio.bz_soft.catviewer.data.models

import com.squareup.moshi.Json

data class CategoriesModel (
    @Json(name = "id")   val id: Int,
    @Json(name = "name") val name: String
)