package kz.porcuon.recipy.search

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_search.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Recipe
import kz.porcuon.recipy.support.BaseFragment

class SearchFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_search

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
        rvRecipeSearch.adapter = RVRecipeSearchAdapter(context!!, recipes)
    }
}