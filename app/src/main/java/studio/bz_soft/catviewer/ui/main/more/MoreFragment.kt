package studio.bz_soft.catviewer.ui.main.more

import androidx.fragment.app.Fragment
import studio.bz_soft.catviewer.root.BackPressedInterface

class MoreFragment : Fragment(), BackPressedInterface {

    override fun onBackPressed(): Boolean {
        return true
    }

    companion object {
        fun instance() : MoreFragment = MoreFragment()
    }
}