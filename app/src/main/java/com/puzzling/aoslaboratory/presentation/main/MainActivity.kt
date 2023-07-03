package com.puzzling.aoslaboratory.presentation.main

import android.os.Bundle
import com.puzzling.aoslaboratory.R
import com.puzzling.aoslaboratory.base.BaseActivity
import com.puzzling.aoslaboratory.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
