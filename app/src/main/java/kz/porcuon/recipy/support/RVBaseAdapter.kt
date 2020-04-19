package kz.porcuon.recipy.support

import androidx.recyclerview.widget.RecyclerView

abstract class RVBaseAdapter<M>(
    protected val items: MutableList<M>
) : RecyclerView.Adapter<VHBase<M>>() {

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: VHBase<M>, position: Int) {
        holder.bind(items[position])
    }
}