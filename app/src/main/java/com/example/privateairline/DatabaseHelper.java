package com.example.privateairline;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "users.db";
    private static int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "_users";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_FIRSTNAME = "first_name";
    private static final String COLUMN_LASTNAME = "last_name";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "lastname";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqlDb) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_FIRSTNAME + " TEXT," +
                COLUMN_LASTNAME + " TEXT," +
                COLUMN_USERNAME + " TEXT," +
                COLUMN_PASSWORD + " TEXT)";
        sqlDb.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addUser(String firstname, String lastname, String username, String password) {

    }
}
