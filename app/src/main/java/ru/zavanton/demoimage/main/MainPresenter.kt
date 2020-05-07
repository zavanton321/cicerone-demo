package ru.zavanton.demoimage.main

import androidx.fragment.app.FragmentManager
import ru.zavanton.demoimage.app.App
import ru.zavanton.demoimage.navigation.DetailScreen
import ru.zavanton.demoimage.navigation.InfoScreen

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

    fun onInfoButtonClick() {
        router.navigateTo(InfoScreen)
    }

    fun onExitButtonClick() {
        router.exit()
    }

    fun onHelperButtonClick(fragmentManager: FragmentManager?) {
        router.showDialog(fragmentManager)
    }
}