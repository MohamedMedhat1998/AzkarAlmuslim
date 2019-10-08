package com.g_developer.azkar_almuslim.data.data_models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.g_developer.azkar_almuslim.utils.Constants.DatabaseTables.AzkarTable.COLUMN_TABLE_NAME
import com.g_developer.azkar_almuslim.utils.Constants.DatabaseTables.AzkarTable.COLUMN_TITLE
import java.io.Serializable

@Entity
data class Azkar(@PrimaryKey val id: Int,
                 @ColumnInfo(name = COLUMN_TABLE_NAME) val tableName: String,
                 @ColumnInfo(name = COLUMN_TITLE) val title: String) : Serializable