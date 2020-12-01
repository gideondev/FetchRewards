package com.gideon.fetchrewards.data.repositories

import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource

/**
 * Repo interface to hide data sources from the rest of the app.
 */
interface DataRepository {
    suspend fun getAllData(): Resource<List<DataItem>>
}
