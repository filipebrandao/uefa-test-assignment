package com.filipebrandao.uefatest.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.filipebrandao.uefatest.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager, lifecycle)
        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabLayout: TabLayout = findViewById(R.id.tabs)
        // bind the viewpager to the tablayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = getString(SectionsPagerAdapter.TAB_TITLES[position])
        }.attach()
    }
}