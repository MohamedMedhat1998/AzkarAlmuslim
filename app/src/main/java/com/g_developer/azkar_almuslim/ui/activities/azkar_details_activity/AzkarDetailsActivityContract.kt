package com.g_developer.azkar_almuslim.ui.activities.azkar_details_activity

import android.database.Cursor
import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.ui.fragments.AzkarViewFragment

interface AzkarDetailsActivityContract {

    interface View {
        fun getRecievedData(): Azkar
        fun populateViewPagerWithData(data: List<AzkarViewFragment>)
    }

    interface Presenter {
        fun onLoad()
        fun onDataLoaded(cursor: Cursor?)
    }

}