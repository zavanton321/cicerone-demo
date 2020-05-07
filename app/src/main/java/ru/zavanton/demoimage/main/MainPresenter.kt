package ru.zavanton.demoimage.main

import ru.zavanton.demoimage.app.App
import ru.zavanton.demoimage.navigation.DetailScreen

class MainPresenter {

    private var view: MainView? = null

    private val router = App.instance.provideRouter()

    fun attachView(view: MainView) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }

    fun onButtonClick() {
        router.navigateTo(DetailScreen)
    }

    fun onExitButtonClick() {
        router.exit()
    }
}