package com.gideon.fetchrewards.data.sources.base

/**
 * Not doing anything special here, just inheriting from DataSource interface.
 * A LocalDataSource will inherit DataSource as well but will have methods relevant to local data
 * management. In this particular case, nothing further is needed for remote data source.
 */
interface DataRemoteSource: DataSource
