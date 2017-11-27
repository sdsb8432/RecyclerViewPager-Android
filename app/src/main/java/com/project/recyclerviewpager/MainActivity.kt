package com.project.recyclerviewpager

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout.addTab(tabLayout.newTab().setText("tab01"))
        tabLayout.addTab(tabLayout.newTab().setText("tab02"))
        tabLayout.addTab(tabLayout.newTab().setText("tab03"))
        tabLayout.addTab(tabLayout.newTab().setText("tab04"))
        tabLayout.addTab(tabLayout.newTab().setText("tab05"))

        adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let { viewPager.currentItem = it.position }
            }
        })
    }
}
