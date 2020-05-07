package ru.zavanton.demoimage.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import ru.zavanton.demoimage.R
import ru.zavanton.demoimage.dialog.HelperDialog

class MainFragment : Fragment(), MainView {

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }

    private val presenter = MainPresenter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.attachView(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showDialogButton.setOnClickListener {
            val dialogFragment = HelperDialog.newInstance("Attention")
            presenter.onHelperButtonClick(fragmentManager, dialogFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}