package com.ucb.app.country.domain.usecase

import com.ucb.app.country.domain.model.CountryModel
import com.ucb.app.country.domain.repository.CountryRepository

class GetCountriesUseCase(
    private val repository: CountryRepository
) {
    suspend operator fun invoke(): List<CountryModel> {
        return repository.getCountries()
    }
}
