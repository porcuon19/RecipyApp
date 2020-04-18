package kz.porcuon.recipy

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_profile

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvProfile.setOnClickListener {
            val navController = Navigation.findNavController(activity!!, R.id.navHostFragment)
            navController.navigate(R.id.action_mainFragment_to_changePasswordFragment)
        }
    }
}