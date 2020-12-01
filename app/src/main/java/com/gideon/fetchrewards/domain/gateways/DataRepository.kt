package com.gideon.fetchrewards.domain.gateways

import com.gideon.fetchrewards.domain.entities.DataItem
import com.gideon.fetchrewards.domain.entities.Resource

/**
 * Repo interface to hide data sources from the rest of the app.
 */
interface DataRepository {
    suspend fun getAllData(): Resource<List<DataItem>>
}
