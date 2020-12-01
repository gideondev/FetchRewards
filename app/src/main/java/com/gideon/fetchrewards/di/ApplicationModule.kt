package com.gideon.fetchrewards.di

import com.gideon.fetchrewards.app.FetchRewardsApplication
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val applicationModule = module {
    module {
        single {
            androidApplication() as FetchRewardsApplication
        }
    }
}
