package kz.porcuon.recipy.preferences

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import kotlinx.android.synthetic.main.block_toolbar.*
import kotlinx.android.synthetic.main.fragment_preferences.*
import kz.porcuon.recipy.R
import kz.porcuon.recipy.support.BaseFragment
import java.util.*

class PreferencesFragment : BaseFragment() {

    override fun getLayoutId(): Int = R.layout.fragment_preferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupToolbar()
        ivAddCuisine.setOnClickListener {
            val random = Random()
            val number = random.nextInt(12)
            var preference = ""
            for (x in 0..number) preference += "a"
            addChip(preference, cgCuisines)
        }
        ivAddDiet.setOnClickListener {
            val random = Random()
            val number = random.nextInt(12)
            var preference = ""
            for (x in 0..number) preference += "b"
            addChip(preference, cgDiets)
        }
        ivAddExcludedIngredient.setOnClickListener {
            val random = Random()
            val number = random.nextInt(12)
            var preference = ""
            for (x in 0..number) preference += "c"
            addChip(preference, cgExcludedIngredients)
        }
    }

    private fun setupToolbar() = with(toolbar) {
        setNavigationIcon(R.drawable.ic_arrow_back_green)
        setNavigationOnClickListener { findNavController().popBackStack() }
        title = getString(R.string.fragment_preferences_title)
    }

    private fun addChip(preference: String, chipGroup: ChipGroup) {
        val chip = createChip(preference, chipGroup)
        chipGroup.addView(chip)
        YoYo.with(Techniques.FadeIn).duration(300).playOn(chip)
    }

    private fun createChip(preference: String, chipGroup: ChipGroup): Chip {
        return Chip(context).apply {
            text = preference
            isCloseIconVisible = true
            chipStrokeWidth = 2F
            chipBackgroundColor = ContextCompat.getColorStateList(context, R.color.colorAccentWhite)
            chipStrokeColor = ContextCompat.getColorStateList(context, R.color.colorPrimary)
            closeIconTint = ContextCompat.getColorStateList(context, R.color.colorPrimary)
            setOnCloseIconClickListener { chip ->
                YoYo.with(Techniques.FadeOut)
                    .duration(300)
                    .onEnd { chipGroup.removeView(chip) }
                    .playOn(chip)
            }
        }
    }
}