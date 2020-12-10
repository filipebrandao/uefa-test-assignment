package com.filipebrandao.uefatest.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.filipebrandao.uefatest.R

class LineStatView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : ConstraintLayout(context, attrs, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_line_stat_view, this, true)
    }

    fun setTitle(title: String) {
        findViewById<TextView>(R.id.title).text = title
    }

    fun setHomeValue(value: String) {
        findViewById<TextView>(R.id.home_value).text = value
    }

    fun setAwayValue(value: String) {
        findViewById<TextView>(R.id.away_value).text = value
    }
}