package com.g_developer.azkar_almuslim.ui.azkar_activity

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import com.g_developer.azkar_almuslim.data.AppDatabase
import com.g_developer.azkar_almuslim.data.data_models.Zekr

class AzkarActivityModel(val context: Context) {

    lateinit var presenter: AzkarActivityPresenter

    fun loadData() {
        AzkarTask({
            AppDatabase.getInstance(context).zekrDao.getAll()
        }) {
            presenter.onDataLoaded(it)
        }.execute()
    }

    private class AzkarTask(val background: () -> List<Zekr>, val finishAction: (List<Zekr>?) -> Unit) : AsyncTask<Unit, Unit, List<Zekr>>() {

        override fun doInBackground(vararg p0: Unit?): List<Zekr> {
            return background.invoke()
        }

        override fun onPostExecute(result: List<Zekr>?) {
            super.onPostExecute(result)
            Log.d("AsyncTask","${result?.size}")
            finishAction.invoke(result)
        }

    }
}