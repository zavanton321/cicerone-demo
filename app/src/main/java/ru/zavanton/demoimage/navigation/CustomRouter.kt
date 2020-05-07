package ru.zavanton.demoimage.navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import ru.terrakok.cicerone.Router

class CustomRouter : Router() {

    fun showDialog(
        fragmentManager: FragmentManager?,
        tag: String,
        dialogFragment: DialogFragment
    ) {
        executeCommands(ShowDialogCommand(fragmentManager, tag, dialogFragment))
    }
}