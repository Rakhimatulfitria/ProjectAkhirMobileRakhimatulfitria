package com.example.projectakhirmobilerakhimatulfitria

import android.app.Application
import com.example.projectakhirmobilerakhimatulfitria.core.di.networkModule
import com.example.projectakhirmobilerakhimatulfitria.core.di.repositoryModule
import com.example.projectakhirmobilerakhimatulfitria.di.useCaseModule
import com.example.projectakhirmobilerakhimatulfitria.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        }
    }
}