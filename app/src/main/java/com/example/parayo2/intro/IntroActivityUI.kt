package com.example.parayo2.intro

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import com.example.parayo2.R
import org.jetbrains.anko.*

class IntroActivityUI : AnkoComponent<IntroActivity> {
    override fun createView(ui: AnkoContext<IntroActivity>): View {
        return ui.relativeLayout {
            gravity = Gravity.CENTER

            //PARAYO 라는 텍스트 출력
            textView("PARAYO") {
                textSize = 24f
                textColorResource = R.color.colorPrimary
                typeface = Typeface.DEFAULT_BOLD
            }
        }
    }

}