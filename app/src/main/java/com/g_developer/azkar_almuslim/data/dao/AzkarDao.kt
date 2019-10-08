package com.g_developer.azkar_almuslim.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.g_developer.azkar_almuslim.data.data_models.Azkar

@Dao
interface AzkarDao {

    @Query("SELECT * FROM Azkar")
    fun getAll() : List<Azkar>

}