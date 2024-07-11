package dev.trindade.robokide.utils

import android.app.Activity
import android.view.View

fun getBackPressedClickListener(activity: Activity): View.OnClickListener {
    return View.OnClickListener { activity.onBackPressed() }
}