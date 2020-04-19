package kz.porcuon.recipy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

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