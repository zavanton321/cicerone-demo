package ru.zavanton.demoimage.navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.terrakok.cicerone.commands.Forward

internal class CustomNavigator(activity: FragmentActivity, containerId: Int) :
    SupportAppNavigator(activity, containerId) {

    override fun fragmentForward(command: Forward) {
        val screen = command.screen as SupportAppScreen
        val fragment = createFragment(screen)

        val fragmentTransaction = fragmentManager.beginTransaction()

        setupFragmentTransaction(
            command,
            fragmentManager.findFragmentById(containerId),
            fragment,
            fragmentTransaction
        )

        if (fragment is DialogFragment) {
            fragment.show(fragmentManager, screen.screenKey)
        } else {
            fragmentTransaction.replace(containerId, fragment!!)

            fragmentTransaction
                .addToBackStack(screen.screenKey)
                .commit()
            localStackCopy.add(screen.screenKey)
        }
    }
}