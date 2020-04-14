package kz.porcuon.recipy

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.block_toolbar.*

class ChangePasswordFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_change_password

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.title = getString(R.string.fragment_change_password_title)
    }
}