package ru.zavanton.demoimage.navigation

import androidx.fragment.app.FragmentActivity
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command

internal class CustomNavigator(activity: FragmentActivity, containerId: Int) :
    SupportAppNavigator(activity, containerId) {

    override fun applyCommand(command: Command) {
        super.applyCommand(command)

        if (command is DialogCommand) {
            val dialogFragment = command.dialogScreen.getDialogFragment()
            dialogFragment.show(fragmentManager, dialogFragment.javaClass.name)
        }
    }
}