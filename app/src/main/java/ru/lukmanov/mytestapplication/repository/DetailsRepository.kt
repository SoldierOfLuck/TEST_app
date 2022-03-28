package ru.lukmanov.mytestapplication.repository

import ru.lukmanov.mytestapplication.model.WeatherDTO

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}