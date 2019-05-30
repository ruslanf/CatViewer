package studio.bz_soft.catviewer.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.view.*
import studio.bz_soft.catviewer.R
import studio.bz_soft.catviewer.root.BackPressedInterface
import studio.bz_soft.catviewer.ui.main.breeds.BreedsFragment
import studio.bz_soft.catviewer.ui.main.categories.CategoriesFragment
import studio.bz_soft.catviewer.ui.main.more.MoreFragment

class MainFragment : Fragment(), BackPressedInterface {

    private val moreFragment = MoreFragment.instance()
    private val breedsFragment = BreedsFragment.instance()
    private val categoriesFragment = CategoriesFragment.instance()

    private fun getCurrentFragment(): Fragment? =
        view?.let {
            childFragmentManager.findFragmentById(it.flMain.id)
        }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            childFragmentManager.beginTransaction()
                    .add(R.id.flMain, categoriesFragment)
                    .add(R.id.flMain, breedsFragment)
                    .add(R.id.flMain, moreFragment)
                    .commit()

            mainBottomNavigationMenu.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menuTitleCategories -> {
                        true
                    }
                    R.id.menuTitleBreeds -> {
                        true
                    }
                    R.id.menuTitleMore -> {
                        true
                    }
                    else -> false
                }
            }
        }
    }

    override fun onBackPressed(): Boolean {
        return (getCurrentFragment() as? BackPressedInterface)?.onBackPressed() ?: false
    }

    companion object {
        fun instance(): MainFragment = MainFragment()
    }
}