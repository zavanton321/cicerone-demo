package ru.zavanton.demoimage.app

import android.app.Application
import android.util.Log

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        Log.d("zavanton", "zavanton - app")
    }
}