package ru.zavanton.demoimage.navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import ru.terrakok.cicerone.commands.Command

class ShowDialogCommand(
    val fragmentManager: FragmentManager?,
    val tag: String,
    val dialogFragment: DialogFragment
) : Command
