package studio.bz_soft.catviewer.ui.main

sealed class MainScreens {
    object CategoriesScreen : MainScreens()
    object BreedsScreen : MainScreens()
    object MoreScreen : MainScreens()
}