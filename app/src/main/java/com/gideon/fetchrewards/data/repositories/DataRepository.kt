package com.gideon.fetchrewards.data.repositories

import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource

interface DataRepository {
    suspend fun getData(): Resource<List<DataItem>>
}
