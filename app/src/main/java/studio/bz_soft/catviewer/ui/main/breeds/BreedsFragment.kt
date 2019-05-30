package studio.bz_soft.catviewer.ui.main.breeds

import androidx.fragment.app.Fragment
import studio.bz_soft.catviewer.root.BackPressedInterface

class BreedsFragment : Fragment(), BackPressedInterface {

    override fun onBackPressed(): Boolean {
        return true
    }

    companion object {
        fun instance() : BreedsFragment = BreedsFragment()
    }
}