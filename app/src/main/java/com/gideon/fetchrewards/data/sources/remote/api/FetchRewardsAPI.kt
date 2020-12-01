package com.gideon.fetchrewards.data.sources.remote.api

import com.gideon.fetchrewards.data.sources.remote.entities.DataItemRemoteEntity
import retrofit2.Response
import retrofit2.http.GET

/**
 * Retrofit service.
 */
interface FetchRewardsAPI {
    @GET("hiring.json")
    suspend fun getAllData(): Response<List<DataItemRemoteEntity>>
}
