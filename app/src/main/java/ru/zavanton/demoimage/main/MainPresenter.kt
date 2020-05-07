package ru.zavanton.demoimage.main

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
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

    fun onHelperButtonClick(
        fragmentManager: FragmentManager?,
        dialogFragment: DialogFragment
    ) {
        router.showDialog(fragmentManager, "some tag", dialogFragment)
    }
}