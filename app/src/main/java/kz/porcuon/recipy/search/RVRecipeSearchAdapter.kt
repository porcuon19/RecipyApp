package kz.porcuon.recipy.search

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Recipe
import kz.porcuon.recipy.support.RVBaseAdapter
import kz.porcuon.recipy.support.VHBase

class RVRecipeSearchAdapter(
    private val context: Context,
    recipes: MutableList<Recipe>
) : RVBaseAdapter<Recipe>(recipes) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBase<Recipe> {
        val view = LayoutInflater.from(context).inflate(R.layout.vh_recipe_search, parent, false)
        return VHRecipeSearch(view)
    }

    inner class VHRecipeSearch(itemView: View) : VHBase<Recipe>(itemView) {
        override fun bind(model: Recipe) {
            // pass
        }
    }
}