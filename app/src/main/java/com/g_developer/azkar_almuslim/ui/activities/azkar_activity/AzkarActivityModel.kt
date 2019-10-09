package com.g_developer.azkar_almuslim.ui.activities.azkar_activity

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import com.g_developer.azkar_almuslim.data.AppDatabase
import com.g_developer.azkar_almuslim.data.data_models.Azkar

class AzkarActivityModel(val context: Context) {

    lateinit var presenter: AzkarActivityPresenter

    fun loadData() {
        AzkarTask({
            AppDatabase.getInstance(context).azkarDao.getAll()
        }) {
            if (::presenter.isInitialized) {
                presenter.onDataLoaded(it)
            }
        }.execute()
    }

    private class AzkarTask(val background: () -> List<Azkar>, val finishAction: (List<Azkar>?) -> Unit) : AsyncTask<Unit, Unit, List<Azkar>>() {

        override fun doInBackground(vararg p0: Unit?): List<Azkar> {
            return background.invoke()
        }

        override fun onPostExecute(result: List<Azkar>?) {
            super.onPostExecute(result)
            Log.d("AsyncTask", "${result?.size}")
            finishAction.invoke(result)
        }

    }
}