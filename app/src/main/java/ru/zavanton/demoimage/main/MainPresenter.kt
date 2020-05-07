package ru.zavanton.demoimage.main

import ru.zavanton.demoimage.app.App

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
        view?.goToDetails()
    }

    fun onExitButtonClick() {
        router.exit()
    }
}