package com.gideon.fetchrewards.domain.models

import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("id")
    val id: Int?,

    @SerializedName("listId")
    val listId: Int?,

    @SerializedName("name")
    val name: String?
)