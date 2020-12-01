package com.gideon.fetchrewards.data.sources.remote

import com.gideon.fetchrewards.data.sources.base.DataRemoteSource
import com.gideon.fetchrewards.data.sources.remote.api.FetchRewardsAPI
import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource


class DataRemoteSourceImpl(private val fetchRewardsAPI: FetchRewardsAPI): DataRemoteSource {
    override suspend fun getAllData(): Resource<List<DataItem>> {
        val response = fetchRewardsAPI.getAllData()
        return if (response.isSuccessful) {
            val dataList: List<DataItem> = response.body()!!
            Resource.Success(dataList)
        } else {
            Resource.Error(Throwable(response.errorBody().toString()))
        }
    }
}
