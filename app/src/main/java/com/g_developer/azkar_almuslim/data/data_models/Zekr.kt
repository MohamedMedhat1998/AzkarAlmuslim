package com.g_developer.azkar_almuslim.data.data_models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.g_developer.azkar_almuslim.utils.Constants.DatabaseTables.AzkarTable.*

@Entity
data class Zekr(@PrimaryKey val id: Int,
                @ColumnInfo(name = COLUMN_NAME) val name: String,
                @ColumnInfo(name = COLUMN_TEXT) val text: String,
                @ColumnInfo(name = COLUMN_COUNT) val count: Int,
                @ColumnInfo(name = COLUMN_MEDIA_URL) val mediaUrl: String)