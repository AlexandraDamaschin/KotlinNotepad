package com.example.android.kotlin.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.android.kotlin.data.NotesContract.SQL_CREATE_ENTRIES;
import static com.example.android.kotlin.data.NotesContract.SQL_DELETE_ENTRIES;

public class NotesOpenHelper extends SQLiteOpenHelper {
    public NotesOpenHelper(Context context) {
        super(context, "notes.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(INSTANCE.getSQL_CREATE_ENTRIES());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(INSTANCE.getSQL_DELETE_ENTRIES());
        onCreate(db);
    }
}
