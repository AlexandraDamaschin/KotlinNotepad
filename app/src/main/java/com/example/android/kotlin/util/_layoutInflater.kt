package com.example.android.kotlin.util

import android.content.Context
import android.view.LayoutInflater

val Context.layoutInflater get () = LayoutInflater.from(this)
