package ru.zavanton.demoimage.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.zavanton.demoimage.R

class DetailFragment : Fragment() {

    companion object {

        fun newInstance(): DetailFragment {
            return DetailFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
}