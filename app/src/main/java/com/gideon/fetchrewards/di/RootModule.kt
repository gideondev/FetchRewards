package com.gideon.fetchrewards.di

/**
 * Instead of polluting the custom application class, all the modules will be combined here and the
 * combined module can be directly used there to initialize Koin.
 */
val rootModule = listOf(
    applicationModule,
    networkModule,
    remoteDataSourcesModule,
    repositoriesModule,
    viewModelsModule
)
