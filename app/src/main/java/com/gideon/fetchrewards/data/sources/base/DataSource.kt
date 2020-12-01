package com.gideon.fetchrewards.data.sources.base

import com.gideon.fetchrewards.domain.entities.DataItem
import com.gideon.fetchrewards.domain.entities.Resource

/**
 * Data source interface. All common data source methods go here.
 */
interface DataSource {
    suspend fun getAllData(): Resource<List<DataItem>>
}
