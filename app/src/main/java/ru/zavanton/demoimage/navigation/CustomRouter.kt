package ru.zavanton.demoimage.navigation

import androidx.fragment.app.FragmentManager
import ru.terrakok.cicerone.Router

class CustomRouter : Router() {

    fun showDialog(fragmentManager: FragmentManager?) {
        executeCommands(ShowDialogCommand(fragmentManager))
    }
}