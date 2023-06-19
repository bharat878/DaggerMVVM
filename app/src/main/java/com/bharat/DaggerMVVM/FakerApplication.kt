package com.bharat.DaggerMVVM

import android.app.Application
import com.bharat.DaggerMVVM.di.ApplicationComponent
import com.bharat.DaggerMVVM.di.DaggerApplicationComponent

class FakerApplication: Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}