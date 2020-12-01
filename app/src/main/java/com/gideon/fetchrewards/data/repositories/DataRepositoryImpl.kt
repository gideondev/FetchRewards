package com.gideon.fetchrewards.data.repositories

import com.gideon.fetchrewards.data.sources.base.DataRemoteSource
import com.gideon.fetchrewards.domain.gateways.DataRepository
import com.gideon.fetchrewards.domain.entities.DataItem
import com.gideon.fetchrewards.domain.entities.Resource

class DataRepositoryImpl(private val dataRemoteSource: DataRemoteSource): DataRepository {
    override suspend fun getAllData(): Resource<List<DataItem>> {
        return dataRemoteSource.getAllData()
    }
}
