package ru.zavanton.demoimage.navigation

import ru.terrakok.cicerone.Router

class CustomRouter : Router() {

    fun showDialog(dialogScreen: DialogScreen) {
        executeCommands(DialogCommand(dialogScreen))
    }
}