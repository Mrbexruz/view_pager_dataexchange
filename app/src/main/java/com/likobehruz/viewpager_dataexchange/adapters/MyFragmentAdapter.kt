package com.likobehruz.viewpager_dataexchange.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.likobehruz.viewpager_dataexchange.fragments.FirstFragment
import com.likobehruz.viewpager_dataexchange.fragments.SecondFragment
import com.likobehruz.viewpager_dataexchange.fragments.ThirdFragment

class MyFragmentAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0->FirstFragment()
            1->SecondFragment()
            2->ThirdFragment()
            else->FirstFragment()
        }
    }

}