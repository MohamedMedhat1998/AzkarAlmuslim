package com.g_developer.azkar_almuslim.ui.activities.azkar_details_activity

import android.database.Cursor
import com.g_developer.azkar_almuslim.utils.AzkarViewFragmentsFactory

class AzkarDetailsActivityPresenter(val view: AzkarDetailsActivityContract.View, private val factory: AzkarViewFragmentsFactory) : AzkarDetailsActivityContract.Presenter {
    lateinit var model: AzkarDetailsActivityModel

    override fun onLoad() {
        if (::model.isInitialized) {
            model.loadAzkarTable(view.getRecievedData())
        }
    }

    override fun onDataLoaded(cursor: Cursor?) {
        view.populateViewPagerWithData(factory.getFragments(cursor))
    }
}