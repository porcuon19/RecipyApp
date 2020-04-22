package kz.porcuon.recipy.cooking

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.vh_cooking_instruction.view.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.models.Instruction
import kz.porcuon.recipy.support.RVBaseAdapter
import kz.porcuon.recipy.support.VHBase

class RVCookingInstructionsAdapter(
    private val context: Context,
    private val instructions: MutableList<Instruction>
) : RVBaseAdapter<Instruction>(instructions) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHBase<Instruction> {
        val view = LayoutInflater.from(context).inflate(R.layout.vh_cooking_instruction, parent, false)
        return VHCookingInstruction(view)
    }

    inner class VHCookingInstruction(itemView: View) : VHBase<Instruction>(itemView) {
        override fun bind(model: Instruction) {
            if (adapterPosition == instructions.size - 1) itemView.vProgress.visibility = View.GONE
        }
    }
}