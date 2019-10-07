package com.g_developer.azkar_almuslim.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.g_developer.azkar_almuslim.data.dao.ZekrDao;
import com.g_developer.azkar_almuslim.data.data_models.Zekr;

import static com.g_developer.azkar_almuslim.utils.Constants.APP_DATABASE_NAME;

@Database(entities = {Zekr.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance = null;

    public static AppDatabase getInstance(Context context) {
        if (instance == null)
            instance = Room.databaseBuilder(context, AppDatabase.class, APP_DATABASE_NAME).build();
        return instance;
    }
    public abstract ZekrDao getZekrDao();
}
