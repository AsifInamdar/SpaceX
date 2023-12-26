package com.asif.spacex

import android.app.Application
import com.asif.spacex.di.networkModule
import com.asif.spacex.di.repoModules
import com.asif.spacex.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(networkModule, repoModules, viewModelModules)
        }
    }

}