package com.g_developer.azkar_almuslim.ui.activities.azkar_details_activity

import android.content.Context
import android.database.Cursor
import android.os.AsyncTask
import com.g_developer.azkar_almuslim.data.AppDatabase
import com.g_developer.azkar_almuslim.data.data_models.Azkar

class AzkarDetailsActivityModel(val context: Context) {

    lateinit var presenter: AzkarDetailsActivityPresenter

    fun loadAzkarTable(azkar: Azkar) {
        AzkarAsyncTask({
            AppDatabase.getInstance(context).openHelper.readableDatabase.query("SELECT * FROM ${azkar.tableName}")
        }) {
            presenter.onDataLoaded(it)
        }.execute()
    }

    private class AzkarAsyncTask(val background: () -> Cursor, val action: (Cursor?) -> Unit)
        : AsyncTask<Unit, Unit, Cursor>() {
        override fun doInBackground(vararg p0: Unit?): Cursor {
            return background.invoke()
        }

        override fun onPostExecute(result: Cursor?) {
            super.onPostExecute(result)
            action.invoke(result)
        }

    }
}