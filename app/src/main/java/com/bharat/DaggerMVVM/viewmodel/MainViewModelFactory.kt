package com.bharat.DaggerMVVM.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bharat.DaggerMVVM.repository.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor (private val repository: ProductRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}