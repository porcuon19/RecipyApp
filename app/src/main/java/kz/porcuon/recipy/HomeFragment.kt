package kz.porcuon.recipy

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recipes = mutableListOf(
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons"),
            Recipe("Hot air balloons")
        )
        val adapter = RVRecipeCategoriesAdapter(context!!, recipes)
        rvRecipeRecommendations.adapter = RVRecipeRecommendationsAdapter(context!!, recipes)
        rvRecipeFavorites.adapter = adapter
        rvRecipeCuisines.adapter = adapter
        rvRecipeDiets.adapter = adapter
    }
}