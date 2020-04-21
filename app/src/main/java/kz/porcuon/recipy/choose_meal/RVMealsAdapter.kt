package kz.porcuon.recipy.choose_meal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Meal
import kz.porcuon.recipy.support.RVBaseAdapter
import kz.porcuon.recipy.support.VHBase

class RVMealsAdapter(
    private val context: Context,
    meals: MutableList<Meal>
) : RVBaseAdapter<Meal>(meals) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBase<Meal> {
        val view = LayoutInflater.from(context).inflate(R.layout.vh_meal, parent, false)
        return VHMeal(view)
    }

    inner class VHMeal(itemView: View) : VHBase<Meal>(itemView) {
        override fun bind(model: Meal) {
            // pass
            itemView.setOnClickListener {  }
        }
    }
}