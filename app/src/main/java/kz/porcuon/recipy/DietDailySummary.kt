package kz.porcuon.recipy

data class DietDailySummary(val date: String, val entries: MutableList<DietDailySummaryEntry>)

data class DietDailySummaryEntry(val title: String)