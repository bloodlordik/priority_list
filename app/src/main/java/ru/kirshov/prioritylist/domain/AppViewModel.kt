package ru.kirshov.prioritylist.domain

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val text:String
):ViewModel() {
    fun title():String = text
    private val _modalState = MutableStateFlow(false)
    val modalState = _modalState.asStateFlow()
    fun showSortMenu(){

    }
    fun showListPageMenu(){

    }
    fun showEditMenu(){

    }
    fun showAddMenu(){
       _modalState.value = true
    }
}