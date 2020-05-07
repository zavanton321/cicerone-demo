package ru.zavanton.demoimage.app

import android.app.Application
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class App : Application() {

    companion object {

        lateinit var instance: App
    }

    private lateinit var cicerone: Cicerone<Router>

    override fun onCreate() {
        super.onCreate()

        instance = this

        cicerone = Cicerone.create()
    }

    fun provideNavigatorHolder(): NavigatorHolder {
        return cicerone.navigatorHolder
    }

    fun provideRouter(): Router {
        return cicerone.router
    }
}