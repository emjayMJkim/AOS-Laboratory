package com.puzzling.aoslaboratory.presentation.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.puzzling.aoslaboratory.data.repository.RegisterRepositoryImpl

class RegisterViewModel(private val registerRepositoryImpl: RegisterRepositoryImpl) : ViewModel() {

    private val _isDateCycleSelected: MutableLiveData<Boolean> = MutableLiveData()
    var isDateCycleSelected: LiveData<Boolean> = _isDateCycleSelected

    val projectName = MutableLiveData<String>()
    val projectExplanation = MutableLiveData<String>()
    var projectStartDate = String()
    val role = MutableLiveData<String>()
    val nickName = MutableLiveData<String>()

}
