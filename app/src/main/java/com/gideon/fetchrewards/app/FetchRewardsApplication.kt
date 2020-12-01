package com.gideon.fetchrewards.app

import android.app.Application
import com.gideon.fetchrewards.di.rootModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Using custom application to initialize Koin DI.
 */
class FetchRewardsApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@FetchRewardsApplication)
            modules(rootModule)
        }
    }
}
