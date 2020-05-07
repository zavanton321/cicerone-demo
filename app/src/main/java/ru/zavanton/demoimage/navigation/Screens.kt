package ru.zavanton.demoimage.navigation

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.zavanton.demoimage.detail.DetailFragment

object DetailScreen : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return DetailFragment.newInstance()
    }
}