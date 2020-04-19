package kz.porcuon.recipy.support

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class VHBase<M>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(model: M)
}