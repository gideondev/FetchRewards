package com.gideon.fetchrewards.app

import android.app.Application
import com.gideon.fetchrewards.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Using custom application to initialize Koin DI.
 */
class FetchRewardsApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // declare used Android context
            androidContext(this@FetchRewardsApplication)

            // declare modules
            modules(mainModule)
        }
    }
}
