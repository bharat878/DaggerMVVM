package com.bharat.DaggerMVVM.retrofit

import com.bharat.DaggerMVVM.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
    suspend fun getProducts(): Response<List<Product>>
}