package ru.lukmanov.mytestapplication.viewmodel

import ru.lukmanov.mytestapplication.model.Weather

sealed class AppState{
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}