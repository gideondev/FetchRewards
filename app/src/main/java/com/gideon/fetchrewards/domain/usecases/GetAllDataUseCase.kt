package com.gideon.fetchrewards.domain.usecases

import com.gideon.fetchrewards.domain.gateways.DataRepository
import com.gideon.fetchrewards.domain.entities.DataItem
import com.gideon.fetchrewards.domain.entities.Resource

class GetAllDataUseCase(private val dataRepository: DataRepository) {
    suspend operator fun invoke(): Resource<List<DataItem>> {
        return dataRepository.getAllData()
    }
}
