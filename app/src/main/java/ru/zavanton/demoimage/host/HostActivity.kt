package ru.zavanton.demoimage.host

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.zavanton.demoimage.R
import ru.zavanton.demoimage.detail.DetailFragment
import ru.zavanton.demoimage.main.MainFragment

class HostActivity : AppCompatActivity(), HostView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportFragmentManager.findFragmentById(R.id.fragmentContainer) == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, MainFragment.newInstance())
                .commit()
        }
    }

    override fun goToDetails() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, DetailFragment.newInstance())
            .commit()
    }
}
