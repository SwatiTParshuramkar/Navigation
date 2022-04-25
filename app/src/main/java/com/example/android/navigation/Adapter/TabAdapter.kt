package com.example.android.navigation.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.android.navigation.Fragment.FirstFragment
import com.example.android.navigation.Fragment.SettingFragment

class TabAdapter (fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {
                return FirstFragment()
            }
            1 -> {
                return SettingFragment()
            }
            else -> {
                return FirstFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {
                return "Tab 1"
            }
            1 -> {
                return "Tab 2"
            }
        }
        return super.getPageTitle(position)
    }

}