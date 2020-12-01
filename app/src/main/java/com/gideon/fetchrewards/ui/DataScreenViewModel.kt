package com.gideon.fetchrewards.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gideon.fetchrewards.data.repositories.DataRepository
import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataScreenViewModel(private val dataRepository: DataRepository) : ViewModel() {
    val dataListLiveData: MutableLiveData<MutableList<DataItem>> = MutableLiveData()

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            when (val fetchedData = dataRepository.getData()) {
                is Resource.Success -> {
                    dataListLiveData.postValue(fetchedData.data.toMutableList())
                }
                is Resource.Error -> {
                    // For Error handling.
                }
            }
        }
    }
}
