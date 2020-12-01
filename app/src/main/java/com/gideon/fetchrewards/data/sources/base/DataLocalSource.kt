package com.gideon.fetchrewards.data.sources.base

import com.gideon.fetchrewards.domain.entities.DataItem

/**
 * In case this application needs to be made offline later.
 */
interface DataLocalSource: DataSource {
    suspend fun saveDataItem(dataItem: DataItem)
    suspend fun saveDataItem(dataItems: List<DataItem>)
}
