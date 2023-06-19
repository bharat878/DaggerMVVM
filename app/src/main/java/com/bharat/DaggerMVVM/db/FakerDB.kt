package com.bharat.DaggerMVVM.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bharat.DaggerMVVM.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB: RoomDatabase() {

    abstract fun getFakerDao(): FakerDao
}