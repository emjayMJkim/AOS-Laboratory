package com.puzzling.aoslaboratory.util

import android.content.res.Resources

// CI 테스트

val Int.dp
    get() = this * Resources.getSystem().displayMetrics.density.toInt()

val Int.px
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()
