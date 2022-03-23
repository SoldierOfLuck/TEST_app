package ru.lukmanov.mytestapplication.model

class RepositoryImpl: Repository {
    override fun getWeatherFromLocalStorage() = Weather()

    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}