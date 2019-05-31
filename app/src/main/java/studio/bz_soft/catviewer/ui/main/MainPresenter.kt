package studio.bz_soft.catviewer.ui.main

import android.view.View
import studio.bz_soft.catviewer.root.MainRouter

class MainPresenter(
        private val view: View,
        private val router: MainRouter
) : MainPresenterInterface {

    private fun onBackPressed() {
        router.exit()
    }
}