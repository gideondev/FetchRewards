package com.gideon.fetchrewards.di


import com.gideon.fetchrewards.app.FetchRewardsApplication
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module


val appModule = listOf(
    module {
        single {
            androidApplication() as FetchRewardsApplication
        }
    },
    networkModule,
    remoteDataSourcesModule,
    repositoriesModule
)