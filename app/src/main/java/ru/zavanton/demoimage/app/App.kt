package ru.zavanton.demoimage.app

import android.app.Application
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.zavanton.demoimage.navigation.CustomRouter

class App : Application() {

    companion object {

        lateinit var instance: App
    }

    private lateinit var cicerone: Cicerone<CustomRouter>

    override fun onCreate() {
        super.onCreate()

        instance = this

        cicerone = Cicerone.create(CustomRouter())
    }

    fun provideNavigatorHolder(): NavigatorHolder {
        return cicerone.navigatorHolder
    }

    fun provideRouter(): CustomRouter {
        return cicerone.router
    }
}