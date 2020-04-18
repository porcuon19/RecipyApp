package kz.porcuon.recipy

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navController = Navigation.findNavController(activity!!, R.id.bottomNavHostFragment)
        bottomNavigationView.setupWithNavController(navController)
    }
}