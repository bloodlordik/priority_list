package ru.kirshov.prioritylist.domain

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val text:String
):ViewModel() {
    fun title():String = text
}