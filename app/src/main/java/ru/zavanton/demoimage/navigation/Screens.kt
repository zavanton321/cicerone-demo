package ru.zavanton.demoimage.navigation

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.zavanton.demoimage.detail.DetailFragment
import ru.zavanton.demoimage.info.InfoActivity

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