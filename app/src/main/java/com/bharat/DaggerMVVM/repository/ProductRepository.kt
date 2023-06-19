package com.bharat.DaggerMVVM.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bharat.DaggerMVVM.db.FakerDB
import com.bharat.DaggerMVVM.models.Product
import com.bharat.DaggerMVVM.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val fakerApi: FakerApi,
    private val fakerDB: FakerDB
) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts() {
        val result = fakerApi.getProducts()
        if (result.isSuccessful && result.body() != null) {
            fakerDB.getFakerDao().addProducts(result.body()!! )
            _products.postValue(result.body())
        }

    }

}