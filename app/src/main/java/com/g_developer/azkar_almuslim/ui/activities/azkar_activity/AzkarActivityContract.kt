package com.g_developer.azkar_almuslim.ui.activities.azkar_activity

import com.g_developer.azkar_almuslim.behaviors.CanOpenActivity
import com.g_developer.azkar_almuslim.data.data_models.Azkar

interface AzkarActivityContract {

    interface View : CanOpenActivity {
        fun populateRecyclerViewWithData(data: List<Azkar>?)
    }

    interface Presenter {
        fun onLoad()
        fun onDataLoaded(data: List<Azkar>?)
        fun onItemClicked(data: Azkar)
    }
}