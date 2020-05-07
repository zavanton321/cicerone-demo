package ru.zavanton.demoimage.host

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.terrakok.cicerone.Navigator
import ru.zavanton.demoimage.R
import ru.zavanton.demoimage.app.App
import ru.zavanton.demoimage.navigation.CustomNavigator

class HostActivity : AppCompatActivity() {

    private val presenter = HostPresenter()

    private val navigator: Navigator = CustomNavigator(this, R.id.fragmentContainer)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.toMainFragment()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()

        App.instance.provideNavigatorHolder().setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()

        App.instance.provideNavigatorHolder().removeNavigator()
    }
}
