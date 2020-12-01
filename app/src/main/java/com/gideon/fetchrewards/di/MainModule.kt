package com.gideon.fetchrewards.di

/**
 * Instead of polluting the custom application class, all the modules will be combined here and the
 * combined module can be directly used there.
 */
val mainModule = listOf(
    applicationModule,
    networkModule,
    remoteDataSourcesModule,
    repositoriesModule,
    viewModelsModule
)
