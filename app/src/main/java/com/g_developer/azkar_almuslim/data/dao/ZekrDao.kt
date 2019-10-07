package com.g_developer.azkar_almuslim.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.g_developer.azkar_almuslim.data.data_models.Zekr

@Dao
interface ZekrDao {
    @Query("SELECT * FROM zekr")
    fun getAll(): List<Zekr>
}