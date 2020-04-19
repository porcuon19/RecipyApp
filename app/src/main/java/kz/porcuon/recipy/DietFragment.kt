package kz.porcuon.recipy

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.block_toolbar.*
import kotlinx.android.synthetic.main.fragment_diet.*

class DietFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_diet

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val entries1 = mutableListOf(
            DietDailySummaryEntry("Hot air balloons"),
            DietDailySummaryEntry("Hot air balloons"),
            DietDailySummaryEntry("Hot air balloons"))
        val entries2 = mutableListOf(
            DietDailySummaryEntry("Hot air balloons"),
            DietDailySummaryEntry("Hot air balloons"))
        val entries3 = mutableListOf(
            DietDailySummaryEntry("Hot air balloons"),
            DietDailySummaryEntry("Hot air balloons"),
            DietDailySummaryEntry("Hot air balloons"),
            DietDailySummaryEntry("Hot air balloons"))

        val dailySummaries = mutableListOf(
            DietDailySummary("", entries1),
            DietDailySummary("", entries2),
            DietDailySummary("", entries3))
        val adapter = RVDietDailySummariesAdapter(context!!, dailySummaries)
        rvDietDailySummaries.adapter = adapter
        toolbar.title = getString(R.string.fragment_diet_title)
    }
}