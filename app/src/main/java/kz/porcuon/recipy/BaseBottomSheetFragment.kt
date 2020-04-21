package kz.porcuon.recipy

import android.app.Dialog
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_base_bottom_sheet.*

abstract class BaseBottomSheetFragment : BottomSheetDialogFragment() {

    protected abstract fun getLayoutId(): Int

    protected open fun isCloseableByDrag(): Boolean = true

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = BottomSheetDialog(activity!!)
        dialog.apply {
            setOnShowListener {
                val bottomSheet = dialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
                bottomSheet?.setBackgroundColor(Color.TRANSPARENT)
            }
            behavior.apply {
                isHideable = isCloseableByDrag()
                state = BottomSheetBehavior.STATE_EXPANDED
                skipCollapsed = true
            }
            dismissWithAnimation = true
        }
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_base_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.let {
            LayoutInflater.from(it).inflate(getLayoutId(), flContent)
        }
    }
}