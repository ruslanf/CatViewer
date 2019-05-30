package studio.bz_soft.catviewer.ui.main.categories

import androidx.fragment.app.Fragment
import studio.bz_soft.catviewer.root.BackPressedInterface

class CategoriesFragment : Fragment(), BackPressedInterface {

    override fun onBackPressed(): Boolean {
        return true
    }

    companion object {
        fun instance() : CategoriesFragment = CategoriesFragment()
    }
}