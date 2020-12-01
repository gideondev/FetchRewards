package com.gideon.fetchrewards.data.sources.remote.entities

import com.gideon.fetchrewards.domain.entities.DataItem
import com.google.gson.annotations.SerializedName

/**
 * Often times, remote APIs change and we don't want to break the rest of the application when that
 * changes. So for connecting to remote API, we use remote entities, but the rest of the app will
 * use domain entities.
 */
data class DataItemRemoteEntity(
    @SerializedName("id")
    val id: Int?,

    @SerializedName("listId")
    val listId: Int?,

    @SerializedName("name")
    val name: String?
)

/**
 * Taking advantage of Kotlin extension functions to convert remote entity to domain entity.
 */
fun DataItemRemoteEntity.toDomainObject() : DataItem {
    return DataItem(
        id, listId, name
    )
}
