package com.g_developer.azkar_almuslim.ui.azkar_activity

import com.g_developer.azkar_almuslim.data.data_models.Zekr

interface AzkarActivityContract {
    interface View{
        fun populateRecyclerViewWithData(data : List<Zekr>?)
    }

    interface Presenter{
        fun onLoad()
        fun onDataLoaded(data: List<Zekr>?)
    }
}