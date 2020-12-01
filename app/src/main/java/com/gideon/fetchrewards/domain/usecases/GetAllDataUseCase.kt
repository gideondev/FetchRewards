package com.gideon.fetchrewards.domain.usecases

import com.gideon.fetchrewards.domain.gateways.DataRepository
import com.gideon.fetchrewards.domain.models.DataItem
import com.gideon.fetchrewards.domain.models.Resource

class GetAllDataUseCase(private val dataRepository: DataRepository) {
    suspend operator fun invoke(): Resource<List<DataItem>> {
        return dataRepository.getAllData()
    }
}
