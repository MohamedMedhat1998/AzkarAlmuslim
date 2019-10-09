package com.g_developer.azkar_almuslim.utils

import android.database.Cursor
import com.g_developer.azkar_almuslim.data.data_models.Zekr
import com.g_developer.azkar_almuslim.ui.fragments.AzkarViewFragment
import com.g_developer.azkar_almuslim.utils.Constants.DatabaseTables.ZekrTable.*

class AzkarViewFragmentsFactory {

    fun getFragments(cursor: Cursor?): List<AzkarViewFragment> {
        val result: MutableList<AzkarViewFragment> = mutableListOf()
        if (cursor != null) {
            while (cursor.moveToNext()) {
                val id = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
                val name = cursor.getString(cursor.getColumnIndex(COLUMN_NAME))
                val text = cursor.getString(cursor.getColumnIndex(COLUMN_TEXT))
                val count = cursor.getInt(cursor.getColumnIndex(COLUMN_COUNT))
                val mediaUrl = cursor.getString(cursor.getColumnIndex(COLUMN_MEDIA_URL))
                result.add(AzkarViewFragment.newInstance(Zekr(id, name, text, count, mediaUrl)))
            }
        }
        return result
    }

}