package ru.zavanton.demoimage.host

import ru.zavanton.demoimage.app.App
import ru.zavanton.demoimage.navigation.MainScreen

class HostPresenter {

    private val router = App.instance.provideRouter()

    fun toMainFragment() {
        router.navigateTo(MainScreen)
    }
}