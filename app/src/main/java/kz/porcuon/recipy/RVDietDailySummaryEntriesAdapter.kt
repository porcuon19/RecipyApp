package kz.porcuon.recipy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RVDietDailySummaryEntriesAdapter(
    private val context: Context,
    entries: MutableList<DietDailySummaryEntry>
) : RVBaseAdapter<DietDailySummaryEntry>(entries) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBase<DietDailySummaryEntry> {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.vh_diet_daily_summary_entry, parent, false)
        return VHDietSummaryEntry(view)
    }

    inner class VHDietSummaryEntry(itemView: View) : VHBase<DietDailySummaryEntry>(itemView) {
        override fun bind(model: DietDailySummaryEntry) {
            // pass
        }
    }
}