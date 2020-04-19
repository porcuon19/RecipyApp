package kz.porcuon.recipy.registration

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_registration.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.support.BaseFragment

class RegistrationFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_registration

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvSignIn.setOnClickListener {
            findNavController().popBackStack()
        }

        btnRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_preferencesFragment)
        }
    }
}