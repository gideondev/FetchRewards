package com.gideon.fetchrewards.data.sources.remote

import com.gideon.fetchrewards.data.sources.base.DataRemoteSource
import com.gideon.fetchrewards.data.sources.remote.api.FetchRewardsAPI
import com.gideon.fetchrewards.data.sources.remote.entities.DataItemRemoteEntity
import com.gideon.fetchrewards.data.sources.remote.entities.toDomainObject
import com.gideon.fetchrewards.domain.entities.DataItem
import com.gideon.fetchrewards.domain.entities.Resource


class DataRemoteSourceImpl(private val fetchRewardsAPI: FetchRewardsAPI): DataRemoteSource {
    override suspend fun getAllData(): Resource<List<DataItem>> {
        try {
            val response = fetchRewardsAPI.getAllData()
            return if (response.isSuccessful) {
                val dataItemsRemoteEntitiesList: List<DataItemRemoteEntity> = response.body()!!

                // The Remote entities needs to be converted to domain entities.
                val dataItemsDomainEntitiesList = mutableListOf<DataItem>()
                for (dataItemRemoteEntity in dataItemsRemoteEntitiesList) {
                    dataItemsDomainEntitiesList.add(dataItemRemoteEntity.toDomainObject())
                }

                Resource.Success(dataItemsDomainEntitiesList)
            } else {
                Resource.Error(Throwable(response.errorBody().toString()))
            }
        } catch (e: Exception) {
            return Resource.Error(Throwable("Something went wrong."))
        }
    }
}
