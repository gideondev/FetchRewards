package com.gideon.fetchrewards.ui

import androidx.lifecycle.ViewModel
import com.gideon.fetchrewards.data.repositories.DataRepository

class DataScreenViewModel(private val dataRepository: DataRepository) : ViewModel() {
    init {
        fetchData()
    }

    private fun fetchData() {
        // TODO: Implement this.
    }
}
