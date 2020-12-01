package com.gideon.fetchrewards.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideon.fetchrewards.data.repositories.DataRepository
import com.gideon.fetchrewards.domain.models.DataItem

class DataScreenViewModel(private val dataRepository: DataRepository) : ViewModel() {
    val dataListLiveData: MutableLiveData<MutableList<DataItem>> = MutableLiveData()

    init {
        fetchData()
    }

    private fun fetchData() {
        // TODO: Implement this.
    }
}
