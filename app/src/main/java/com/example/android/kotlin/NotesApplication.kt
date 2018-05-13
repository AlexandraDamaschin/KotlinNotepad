package com.example.android.kotlin

import android.app.Application

import com.example.android.kotlin.data.DataStore

class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DataStore.init(this)
    }
}
