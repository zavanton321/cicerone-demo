package ru.zavanton.demoimage.main

class MainPresenter {

    private var view: MainView? = null

    fun attachView(view: MainView) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }

    fun onButtonClick() {
        view?.goToDetails()
    }
}