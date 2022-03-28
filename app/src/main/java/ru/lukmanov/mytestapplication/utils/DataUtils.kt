package ru.lukmanov.mytestapplication.utils

import ru.lukmanov.mytestapplication.model.FactDTO
import ru.lukmanov.mytestapplication.model.Weather
import ru.lukmanov.mytestapplication.model.WeatherDTO
import ru.lukmanov.mytestapplication.model.getDefaultCity


fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!! // !! - это риск!!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!,
        fact.pressure_mm!!, fact.humidity!!, fact.season!!, fact.icon
    ))
}