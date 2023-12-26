package com.asif.spacex

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getAllContinents() {
        viewModelScope.launch {
           val response = mainRepository.getContinents()
            Log.d("Api response", "getAllContinents: ${response.data?.continents}")
        }
    }
}