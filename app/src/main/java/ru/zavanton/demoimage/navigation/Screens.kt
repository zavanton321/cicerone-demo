package ru.zavanton.demoimage.navigation

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.zavanton.demoimage.dialog.HelperDialog
import ru.zavanton.demoimage.main.MainFragment

object MainScreen : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return MainFragment.newInstance()
    }
}

class DialogScreen(private val title: String) : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return HelperDialog.newInstance(title)
    }
}