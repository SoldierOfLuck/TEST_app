package ru.lukmanov.mytestapplication.model

data class WeatherDTO (
    val fact: FactDTO?
)

data class FactDTO(
    val temp: Int?,
    val feels_like: Int?,
    val condition: String?,
    val wind_speed: Int?,
    val humidity: Int?,
    val season: String?
)