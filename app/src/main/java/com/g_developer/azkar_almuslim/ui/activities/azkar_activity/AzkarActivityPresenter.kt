package com.g_developer.azkar_almuslim.ui.activities.azkar_activity

import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import com.g_developer.azkar_almuslim.ui.activities.azkar_details_activity.AzkarDetailsActivity

class AzkarActivityPresenter(private val view: AzkarActivityContract.View) : AzkarActivityContract.Presenter {
    lateinit var model: AzkarActivityModel

    override fun onLoad() {
        model.loadData()
    }

    override fun onDataLoaded(data: List<Azkar>?) {
        view.populateRecyclerViewWithData(data)
    }

    override fun onItemClicked(data: Azkar) {
        view.openActivity(AzkarDetailsActivity::class.java, data)
    }
}