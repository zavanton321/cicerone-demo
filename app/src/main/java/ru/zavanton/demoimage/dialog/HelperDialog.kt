package ru.zavanton.demoimage.dialog

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class HelperDialog : DialogFragment() {

    companion object {

        private const val TITLE = "title"

        fun newInstance(title: String): HelperDialog {
            return HelperDialog()
                .also { dialog ->
                    dialog.arguments = Bundle()
                        .also { bundle ->
                            bundle.putString(TITLE, title)
                        }
                }
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getString(TITLE) ?: "some default title"

        return AlertDialog.Builder(requireContext())
            .setTitle(title)
            .setMessage("Some message")
            .setCancelable(true)
            .setPositiveButton("Ok",
                DialogInterface.OnClickListener { dialog, which ->
                    Log.d(
                        "zavanton",
                        "zavanton - ok"
                    )
                })
            .setNegativeButton("Cancel",
                DialogInterface.OnClickListener { dialog, which ->
                    // no implementation
                })
            .create()
    }
}