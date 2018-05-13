package com.example.android.kotlin.data

import com.example.android.kotlin.data.NotesContract.NoteTable.CREATED_AT
import com.example.android.kotlin.data.NotesContract.NoteTable.IS_PINNED
import com.example.android.kotlin.data.NotesContract.NoteTable.TEXT
import com.example.android.kotlin.data.NotesContract.NoteTable.UPDATED_AT
import com.example.android.kotlin.data.NotesContract.NoteTable._ID
import com.example.android.kotlin.data.NotesContract.NoteTable._TABLE_NAME

object NotesContract {

    object NoteTable {
        val _ID = "_id"
        val _TABLE_NAME = "notes"
        val TEXT = "text"
        val IS_PINNED = "is_pinned"
        val CREATED_AT = "created_at"
        val UPDATED_AT = "updated_at"

    }

    val SQL_CREATE_ENTRIES =
            "CREATE TABLE " + _TABLE_NAME + " (" +
            _ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
            TEXT + " TEXT, " +
            IS_PINNED + " INTEGER, " +
            CREATED_AT + " INTEGER, " +
            UPDATED_AT + " INTEGER" +
            ")"

    val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + _TABLE_NAME

    val SQL_QUERY_ALL =
            "SELECT * FROM NOTE ORDER BY $CREATED_AT DESC"


}
