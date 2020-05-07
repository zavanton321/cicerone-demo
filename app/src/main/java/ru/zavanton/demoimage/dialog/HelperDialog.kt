package ru.zavanton.demoimage.dialog

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class HelperDialog : DialogFragment() {

    companion object {

        fun newInstance(): HelperDialog {
            return HelperDialog()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())

        builder.setTitle("Some Title")
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

        return builder.create()
    }
}