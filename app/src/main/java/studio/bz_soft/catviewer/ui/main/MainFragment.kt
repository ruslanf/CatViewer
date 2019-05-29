package studio.bz_soft.catviewer.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.view.*
import studio.bz_soft.catviewer.R
import studio.bz_soft.catviewer.root.BackPressedInterface

class MainFragment : Fragment(), BackPressedInterface {

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
    }

    override fun onBackPressed(): Boolean {
        return (getCurrentFragment() as? BackPressedInterface)?.onBackPressed() ?: false
    }

    companion object {
        fun instance(): MainFragment = MainFragment()
    }
}