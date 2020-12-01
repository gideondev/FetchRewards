package com.gideon.fetchrewards.data.sources.base

import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource

interface DataSource {
    suspend fun getAllData(): Resource<List<DataItem>>
}
