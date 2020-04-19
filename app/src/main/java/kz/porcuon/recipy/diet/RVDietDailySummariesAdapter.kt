package kz.porcuon.recipy.diet

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.vh_diet_daily_summary.view.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.DietDailySummary
import kz.porcuon.recipy.support.RVBaseAdapter
import kz.porcuon.recipy.support.VHBase

class RVDietDailySummariesAdapter(
    private val context: Context,
    dietDailySummaries: MutableList<DietDailySummary>
) : RVBaseAdapter<DietDailySummary>(dietDailySummaries) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBase<DietDailySummary> {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.vh_diet_daily_summary, parent, false)
        return VHDietSummary(view)
    }

    inner class VHDietSummary(itemView: View) : VHBase<DietDailySummary>(itemView) {
        override fun bind(model: DietDailySummary) = with(itemView) {
            val adapter =
                RVDietDailySummaryEntriesAdapter(context, model.entries)
            rvDietDailySummaryEntries.adapter = adapter
        }
    }
}