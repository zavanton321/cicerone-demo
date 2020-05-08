package ru.zavanton.demoimage.navigation

import android.content.Context
import android.content.Intent
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.zavanton.demoimage.detail.DetailFragment
import ru.zavanton.demoimage.dialog.HelperDialog
import ru.zavanton.demoimage.info.InfoActivity
import ru.zavanton.demoimage.main.MainFragment

object MainScreen : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return MainFragment.newInstance()
    }
}

object DetailScreen : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return DetailFragment.newInstance()
    }
}

object InfoScreen : SupportAppScreen() {

    override fun getActivityIntent(context: Context): Intent? {
        return Intent(context, InfoActivity::class.java)
    }
}

abstract class DialogScreen : SupportAppScreen() {

    abstract fun getDialogFragment(): DialogFragment
}

class HelperDialogScreen(val title: String) : DialogScreen() {

    override fun getDialogFragment(): DialogFragment {

        return HelperDialog.newInstance(title)
    }
}