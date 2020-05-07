package ru.zavanton.demoimage.dialog

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class HelperDialog : DialogFragment() {

    companion object {

        private const val TITLE = "title"

        fun newInstance(title: String): HelperDialog {
            return HelperDialog()
                .also { helperDialog ->
                    helperDialog.arguments = Bundle()
                        .also { bundle ->
                            bundle.putString(TITLE, title)
                        }
                }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getString(TITLE) ?: "default title"

        return AlertDialog.Builder(requireContext())
            .setTitle(title)
            .setMessage("Some message")
            .setCancelable(true)
            .setPositiveButton("Ok") { dialog, which ->
                Log.d("zavanton", "zavanton - ok")
            }
            .setNegativeButton("Cancel") { dialog, which ->
                // no implementation
            }
            .create()
    }
}