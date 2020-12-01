package com.gideon.fetchrewards.di

import com.gideon.fetchrewards.data.repositories.DataRepository
import com.gideon.fetchrewards.data.repositories.DataRepositoryImpl
import org.koin.dsl.module

val repositoriesModule = module {
    single<DataRepository> {
        DataRepositoryImpl(
            dataRemoteSource = get()
        )
    }
}
