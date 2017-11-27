package com.project.recyclerviewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by sonseongbin on 2017. 11. 27..
 */
class ViewPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment = RecyclerViewFragment()

    override fun getCount(): Int = 5
}