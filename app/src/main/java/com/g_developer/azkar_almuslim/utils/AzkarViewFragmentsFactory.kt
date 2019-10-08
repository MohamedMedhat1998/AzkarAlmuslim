package com.g_developer.azkar_almuslim.utils

import android.content.Context
import com.g_developer.azkar_almuslim.data.AppDatabase
import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import com.g_developer.azkar_almuslim.ui.fragments.AzkarViewFragment
import com.g_developer.azkar_almuslim.utils.Constants.DatabaseTables.ZekrTable.*

class AzkarViewFragmentsFactory(private val context: Context) {

    fun getFragments(azkar: Azkar): List<AzkarViewFragment> {
        //TODO AsyncTask
        val zekrCursor = AppDatabase.getInstance(context).openHelper.readableDatabase.query("SELECT * FROM ${azkar.tableName}")
        val result: MutableList<AzkarViewFragment> = mutableListOf()
        while (zekrCursor.moveToNext()) {
            val id = zekrCursor.getInt(zekrCursor.getColumnIndex(COLUMN_ID))
            val name = zekrCursor.getString(zekrCursor.getColumnIndex(COLUMN_NAME))
            val text = zekrCursor.getString(zekrCursor.getColumnIndex(COLUMN_TEXT))
            val count = zekrCursor.getInt(zekrCursor.getColumnIndex(COLUMN_COUNT))
            val mediaUrl = zekrCursor.getString(zekrCursor.getColumnIndex(COLUMN_MEDIA_URL))
            result.add(AzkarViewFragment.newInstance(Zekr(id, name, text, count, mediaUrl)))
        }
        return result
    }

}