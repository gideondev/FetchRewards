package com.gideon.fetchrewards.data.repositories

import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource

interface DataRepository {
    suspend fun getAllData(): Resource<List<DataItem>>
}
