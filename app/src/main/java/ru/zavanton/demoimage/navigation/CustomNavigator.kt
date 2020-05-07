package ru.zavanton.demoimage.navigation

import androidx.fragment.app.FragmentActivity
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command

internal class CustomNavigator(activity: FragmentActivity, containerId: Int) :
    SupportAppNavigator(activity, containerId) {

    override fun applyCommand(command: Command) {
        super.applyCommand(command)

        if (command is ShowDialogCommand) {
            val fragmentManager = command.fragmentManager
            val tag = command.tag
            val dialogFragment = command.dialogFragment

            dialogFragment.show(fragmentManager, tag)
        }
    }
}