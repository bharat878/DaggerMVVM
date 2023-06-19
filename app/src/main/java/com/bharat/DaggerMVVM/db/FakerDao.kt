package com.bharat.DaggerMVVM.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bharat.DaggerMVVM.models.Product

@Dao
interface FakerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProducts(products: List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts(): List<Product>
}