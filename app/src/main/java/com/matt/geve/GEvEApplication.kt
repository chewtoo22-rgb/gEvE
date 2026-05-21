package com.matt.geve

import android.app.Application
import com.matt.geve.data.AppDatabase

class GEvEApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }

    override fun onCreate() {
        super.onCreate()
        // Initialize application-level components
    }
}
