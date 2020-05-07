package ru.zavanton.demoimage.host

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command
import ru.zavanton.demoimage.R
import ru.zavanton.demoimage.app.App
import ru.zavanton.demoimage.detail.DetailFragment
import ru.zavanton.demoimage.main.MainFragment

class HostActivity : AppCompatActivity(), HostView {

    private val navigator: Navigator = SupportAppNavigator(this, R.id.fragmentContainer)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentById(R.id.fragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, MainFragment.newInstance())
                .commit()
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()

        App.instance.provideNavigatorHolder().setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()

        App.instance.provideNavigatorHolder().removeNavigator()
    }

    override fun goToDetails() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, DetailFragment.newInstance())
            .commit()
    }
}
