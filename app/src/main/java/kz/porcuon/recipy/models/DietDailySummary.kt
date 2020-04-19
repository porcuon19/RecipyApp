package kz.porcuon.recipy.models

data class DietDailySummary(val date: String, val entries: MutableList<DietDailySummaryEntry>)

data class DietDailySummaryEntry(val title: String)