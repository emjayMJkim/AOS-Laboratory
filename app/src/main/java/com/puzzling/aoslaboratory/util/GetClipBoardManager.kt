package com.puzzling.aoslaboratory.util

import android.content.ClipboardManager
import android.content.Context

fun Context.getClipboardManager(): ClipboardManager {
    return getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
}
