package com.ucb.app.country.data.service

import com.ucb.app.country.data.dto.CountryDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class CountryApiService {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                prettyPrint = true
                isLenient = true
            })
        }
    }

    suspend fun getCountries(): List<CountryDto> {
        val response = client.get("https://restcountries.com/v3.1/all?fields=name,flags,population,region,capital")
        return response.body()
    }
}
