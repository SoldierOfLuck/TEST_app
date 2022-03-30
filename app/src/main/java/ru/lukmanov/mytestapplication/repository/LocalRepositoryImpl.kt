package ru.lukmanov.mytestapplication.repository

import ru.lukmanov.mytestapplication.model.Weather
import ru.lukmanov.mytestapplication.model.room.HistoryDao
import ru.lukmanov.mytestapplication.utils.convertHistoryEntityToWeather
import ru.lukmanov.mytestapplication.utils.convertWeatherToEntity

class LocalRepositoryImpl(private val localDataSource: HistoryDao) :
    LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }
    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}