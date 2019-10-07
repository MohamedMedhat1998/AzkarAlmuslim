package com.g_developer.azkar_almuslim.ui.azkar_activity

import android.util.Log
import com.g_developer.azkar_almuslim.data.data_models.Zekr

class AzkarActivityPresenter(private val view : AzkarActivityContract.View) : AzkarActivityContract.Presenter {

    lateinit var model: AzkarActivityModel

    override fun onLoad() {
        model.loadData()
    }

    override fun onDataLoaded(data: List<Zekr>?) {
        view.populateRecyclerViewWithData(data)
        Log.d("onDataLoaded","Worked!")
        Log.d("onDataLoaded","${data?.size}")
    }
}