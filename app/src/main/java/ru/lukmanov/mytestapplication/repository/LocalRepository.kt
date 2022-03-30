package ru.lukmanov.mytestapplication.repository

import ru.lukmanov.mytestapplication.model.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}