package com.gideon.fetchrewards.data.sources.remote.api

import com.gideon.fetchrewards.domain.models.DataItem
import retrofit2.Response
import retrofit2.http.GET

interface FetchRewardsAPI {
    @GET("hiring.json")
    suspend fun getAllData(): Response<List<DataItem>>
}
