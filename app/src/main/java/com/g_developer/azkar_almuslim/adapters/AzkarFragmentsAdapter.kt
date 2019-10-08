package com.g_developer.azkar_almuslim.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.g_developer.azkar_almuslim.ui.fragments.AzkarViewFragment

class AzkarFragmentsAdapter(fragmentManager: FragmentManager,private val fragments: List<AzkarViewFragment>)
    : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}