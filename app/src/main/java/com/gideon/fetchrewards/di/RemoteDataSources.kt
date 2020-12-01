package com.gideon.fetchrewards.di

import com.gideon.fetchrewards.data.sources.base.DataRemoteSource
import com.gideon.fetchrewards.data.sources.remote.DataRemoteSourceImpl
import org.koin.dsl.module

val remoteDataSourcesModule = module {
    single<DataRemoteSource> {
        DataRemoteSourceImpl(
            fetchRewardsAPI = get()
        )
    }
}
