package kz.porcuon.recipy.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.vh_recipe_recommendation.view.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Recipe
import kz.porcuon.recipy.support.RVBaseAdapter
import kz.porcuon.recipy.support.VHBase

class RVRecipeRecommendationsAdapter(
    private val context: Context,
    recipes: MutableList<Recipe>
) : RVBaseAdapter<Recipe>(recipes) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBase<Recipe> {
        val view = LayoutInflater.from(context).inflate(R.layout.vh_recipe_recommendation, parent, false)
        return VHRecipeRecommendation(view)
    }

    inner class VHRecipeRecommendation(itemView: View) : VHBase<Recipe>(itemView) {
        override fun bind(model: Recipe) = with(itemView) {
            tvRecipeTitle.text = model.title
        }
    }
}