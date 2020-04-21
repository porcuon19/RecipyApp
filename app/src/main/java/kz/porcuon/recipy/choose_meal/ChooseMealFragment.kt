package kz.porcuon.recipy.choose_meal

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_choose_meal.*
import kz.porcuon.recipy.BaseBottomSheetFragment
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Meal

class ChooseMealFragment : BaseBottomSheetFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_choose_meal

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val meals = mutableListOf(
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal(""),
            Meal("")
        )
        rvMeals?.adapter = RVMealsAdapter(context!!, meals)
    }
}