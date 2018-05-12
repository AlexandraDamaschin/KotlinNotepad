package com.example.android.kotlin;

import android.app.Application;

import com.example.android.kotlin.data.DataStore;

public class NotesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataStore.init(this);
    }
}
