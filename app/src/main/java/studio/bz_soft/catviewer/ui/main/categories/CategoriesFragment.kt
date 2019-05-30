package studio.bz_soft.catviewer.ui.main.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import studio.bz_soft.catviewer.R
import studio.bz_soft.catviewer.root.BackPressedInterface

class CategoriesFragment : Fragment(), BackPressedInterface {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_categories, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onBackPressed(): Boolean {
        return true
    }

    companion object {
        fun instance(): CategoriesFragment = CategoriesFragment()
    }
}