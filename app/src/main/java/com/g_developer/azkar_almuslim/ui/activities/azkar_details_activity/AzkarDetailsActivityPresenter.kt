package com.g_developer.azkar_almuslim.ui.activities.azkar_details_activity

import com.g_developer.azkar_almuslim.utils.AzkarViewFragmentsFactory

class AzkarDetailsActivityPresenter(val view : AzkarDetailsActivityContract.View,val factory: AzkarViewFragmentsFactory) : AzkarDetailsActivityContract.Presenter {
    override fun onLoad() {
        view.populateViewPagerWithData(factory.getFragments(view.getRecievedData()))
    }
}