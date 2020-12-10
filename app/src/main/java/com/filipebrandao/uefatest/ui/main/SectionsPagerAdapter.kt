package com.filipebrandao.uefatest.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.filipebrandao.uefatest.R
import com.filipebrandao.uefatest.ui.main.stats.StatsFragment

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(
    private val context: Context,
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    companion object {
        val TAB_TITLES = arrayOf(
            R.string.tab_overview,
            R.string.tab_lineups,
            R.string.tab_stats,
            R.string.tab_matchinfo
        )

        private const val STATS_TAB_POSITION = 2
    }

    override fun createFragment(position: Int): Fragment {
        if (position != STATS_TAB_POSITION) {
            return PlaceholderFragment.newInstance(context.getString(TAB_TITLES[position]))
        } else {
            return StatsFragment.newInstance()
        }
    }

    override fun getItemCount(): Int {
        return TAB_TITLES.size
    }
}