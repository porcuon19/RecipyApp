package kz.porcuon.recipy.cooking

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.block_toolbar.*
import kotlinx.android.synthetic.main.fragment_cooking.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Instruction
import kz.porcuon.recipy.support.BaseFragment

class CookingFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_cooking

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_green)
        toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        toolbar.title = getString(R.string.fragment_cooking_title)
        val instructions = mutableListOf(
            Instruction(),
            Instruction(),
            Instruction(),
            Instruction(),
            Instruction(),
            Instruction()
        )
        rvCookingInstructions.adapter = RVCookingInstructionsAdapter(context!!, instructions)
    }
}