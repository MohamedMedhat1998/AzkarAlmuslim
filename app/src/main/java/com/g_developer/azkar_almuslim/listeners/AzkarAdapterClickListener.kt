package com.g_developer.azkar_almuslim.listeners

import com.g_developer.azkar_almuslim.data.data_models.Azkar
import com.g_developer.azkar_almuslim.data.data_models.Zekr

interface AzkarAdapterClickListener {

    fun onItemClicked(data: Azkar)

    fun onPlayClicked(data: Azkar)

    fun onFavoriteClicked(data: Azkar)

}