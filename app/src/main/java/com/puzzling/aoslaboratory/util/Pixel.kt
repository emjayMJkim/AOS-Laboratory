package com.puzzling.aoslaboratory.util

import android.content.res.Resources

// 더미파일

val Int.dp
    get() = this * Resources.getSystem().displayMetrics.density.toInt()

val Int.px
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()
