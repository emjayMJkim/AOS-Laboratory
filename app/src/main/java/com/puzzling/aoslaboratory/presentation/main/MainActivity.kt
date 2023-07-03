package com.puzzling.aoslaboratory.presentation.main

import android.os.Bundle
import com.puzzling.aoslaboratory.R
import com.puzzling.aoslaboratory.base.BaseActivity
import com.puzzling.aoslaboratory.databinding.ActivityMainBinding
import com.puzzling.aoslaboratory.presentation.register.CodeCopyDialogFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val codeCopyDialog: CodeCopyDialogFragment by lazy { CodeCopyDialogFragment() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        clickRegisterBtn()
    }

    private fun clickRegisterBtn() {
        binding.btnHomeRegister.setOnClickListener {
            codeCopyDialog.show(supportFragmentManager, "LOADING_DIALOG")
        }
    }
}
