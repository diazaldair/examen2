package com.ucb.app.country.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CountryDto(
    val name: NameDto,
    val capital: List<String>? = null,
    val region: String,
    val population: Long,
    val flags: FlagsDto
)

@Serializable
data class NameDto(
    val common: String,
    val official: String
)

@Serializable
data class FlagsDto(
    val png: String,
    val svg: String,
    val alt: String? = null
)
