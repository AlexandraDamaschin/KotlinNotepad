package com.example.android.kotlin.data

import android.content.Context

import java.util.concurrent.Executor
import java.util.concurrent.Executors

object DataStore {

    val EXEC: Executor = Executors.newSingleThreadExecutor()

    //telling compiler exactly how to represent
    @JvmStatic
    lateinit var notes: NoteDatabase
        private set

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(runnable: Runnable) {
        EXEC.execute(runnable)
    }
}
