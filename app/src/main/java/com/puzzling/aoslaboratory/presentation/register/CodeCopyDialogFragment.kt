package com.puzzling.aoslaboratory.presentation.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.puzzling.aoslaboratory.databinding.FragmentCodeCopyDialogBinding

class CodeCopyDialogFragment :
    DialogFragment() {
    private var _binding: FragmentCodeCopyDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCodeCopyDialogBinding.inflate(inflater, container, false)
        val view = binding.root
        clickCloseBtn()
        return view
    }

    private fun clickCloseBtn() {
        binding.btnDialogClose.setOnClickListener {
            dialog?.dismiss()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
