package kz.porcuon.recipy.change_password

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.block_toolbar.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.support.BaseFragment

class ChangePasswordFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_change_password

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupToolbar()
    }

    private fun setupToolbar() = with(toolbar) {
        setNavigationIcon(R.drawable.ic_arrow_back_green)
        setNavigationOnClickListener { findNavController().popBackStack() }
        title = getString(R.string.fragment_change_password_title)
    }
}