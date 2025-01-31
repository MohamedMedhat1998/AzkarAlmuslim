package com.g_developer.azkar_almuslim.utils;

public class Constants {

    public static final String APP_DATABASE_NAME = "Azkar.db";
    public static final String AZKAR_KEY = "azkar";

    public static class DatabaseTables {
        public static class ZekrTable {
            public static final String COLUMN_ID = "id";
            public static final String COLUMN_NAME = "name";
            public static final String COLUMN_TEXT = "text";
            public static final String COLUMN_COUNT = "count";
            public static final String COLUMN_MEDIA_URL = "mediaUrl";
        }
        public static class AzkarTable{
            public static final String COLUMN_TABLE_NAME = "table_name";
            public static final String COLUMN_TITLE = "title";
        }
    }
}
