package com.gideon.fetchrewards.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gideon.fetchrewards.data.repositories.DataRepository
import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class DataScreenViewModel(private val dataRepository: DataRepository) : ViewModel() {
    val dataListLiveData: MutableLiveData<MutableList<DataItem>> = MutableLiveData()

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch(Dispatchers.IO) {
            when (val fetchedData = dataRepository.getData()) {
                is Resource.Success -> {
                    val processedItems = processItems(fetchedData.data)
                    dataListLiveData.postValue(processedItems.toMutableList())
                }
                is Resource.Error -> {
                    // For Error handling.
                }
            }
        }
    }

    private fun processItems(items: List<DataItem>): List<DataItem> {
        val itemsWithoutBlanks = removeItemsWithEmptyNames(items)
        sortItems(itemsWithoutBlanks)
        return itemsWithoutBlanks
    }

    private fun removeItemsWithEmptyNames(items: List<DataItem>): List<DataItem> {
        return items.filter {
            !it.name.isNullOrEmpty()
        }
    }

    private fun sortItems(dataToSort: List<DataItem>): List<DataItem> {
        Collections.sort(dataToSort, ListCustomComparator())
        return dataToSort
    }
}


// A comparator to compare first names of Name
class ListCustomComparator : Comparator<DataItem> {
    override fun compare(item1: DataItem, item2: DataItem): Int {
        return if (item1.listId == item2.listId) {
            if (item1.name != null && item2.name != null) {
                item1.name.compareTo(item2.name)
            } else {
                0
            }
        } else if (item1.listId!! > item2.listId!!) {
            1
        } else {
            -1
        }
    }
}
