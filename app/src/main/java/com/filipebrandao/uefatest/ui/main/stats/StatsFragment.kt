package com.filipebrandao.uefatest.ui.main.stats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.filipebrandao.uefatest.R
import com.filipebrandao.uefatest.ui.widget.LineStatView

/**
 * Fragment for the Stats tab
 */
class StatsFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = StatsFragment()
    }

    private val viewModel by viewModels<StatsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_stats, container, false)
        root.findViewById<TextView>(R.id.section_title).text = getString(R.string.attacking)

        val statsWrapper = root.findViewById<LinearLayout>(R.id.section_stats_wrapper)

        viewModel.getAttackingStats().observe(viewLifecycleOwner,
            Observer { stats ->
                stats.forEach {
                    // inflate a LineStatView for each stat
                    val statView = LineStatView(requireContext())
                    statView.setTitle(it.title)
                    statView.setHomeValue(it.homeValue.toString())
                    statView.setAwayValue(it.awayValue.toString())
                    statView.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, requireContext().resources.getDimensionPixelSize(R.dimen.stat_height));
                    statsWrapper.addView(statView)
                }
            })

        return root
    }
}