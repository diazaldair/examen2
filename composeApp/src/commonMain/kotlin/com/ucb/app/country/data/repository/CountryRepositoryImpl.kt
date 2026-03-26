package com.ucb.app.country.data.repository

import com.ucb.app.country.data.mapper.toModel
import com.ucb.app.country.data.service.CountryApiService
import com.ucb.app.country.domain.model.CountryModel
import com.ucb.app.country.domain.repository.CountryRepository

class CountryRepositoryImpl(
    private val apiService: CountryApiService
) : CountryRepository {
    override suspend fun getCountries(): List<CountryModel> {
        return apiService.getCountries().map { it.toModel() }
    }
}
