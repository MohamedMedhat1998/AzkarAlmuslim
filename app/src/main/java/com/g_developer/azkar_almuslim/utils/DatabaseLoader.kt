package com.g_developer.azkar_almuslim.utils

import android.content.Context
import android.content.res.AssetManager
import com.g_developer.azkar_almuslim.utils.Constants.APP_DATABASE_NAME
import java.io.File
import java.io.FileOutputStream

class DatabaseLoader(private val context: Context) {

    fun loadDatabase() {
        if (!isDatabaseFound()) {
            copyDatabase()
        }
    }

    private fun isDatabaseFound(): Boolean {
        val databaseFile = File(context.getDatabasePath(APP_DATABASE_NAME).absolutePath)
        return databaseFile.exists()
    }

    private fun copyDatabase() {
        val databaseDirectory = File(context.getDatabasePath("x").absolutePath.substring(0, context.getDatabasePath("x").absolutePath.length - 2))
        if (!databaseDirectory.exists()) {
            databaseDirectory.mkdirs()
        }
        val outputFile = FileOutputStream(context.getDatabasePath(APP_DATABASE_NAME).absolutePath)
        val inputFile = context.assets.open(APP_DATABASE_NAME, AssetManager.ACCESS_BUFFER)
        val buffer = ByteArray(1024)
        var hasFinished = inputFile.read(buffer)
        while (hasFinished != -1) {
            outputFile.write(buffer)
            hasFinished = inputFile.read(buffer)
        }
    }
}
