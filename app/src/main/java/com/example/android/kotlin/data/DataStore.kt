package com.example.android.kotlin.data

import android.content.Context
import org.jetbrains.anko.doAsync

import java.util.concurrent.Executor
import java.util.concurrent.Executors

object DataStore {

    //telling compiler exactly how to represent
    @JvmStatic
    lateinit var notes: NoteDatabase
        private set

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(runnable: Runnable) {
        execute { runnable.run() }
    }

    fun execute(fn: () -> Unit) {
        doAsync { fn() }
    }
}
