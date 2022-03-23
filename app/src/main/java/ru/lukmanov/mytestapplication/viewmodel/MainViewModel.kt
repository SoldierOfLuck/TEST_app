package ru.lukmanov.mytestapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.lukmanov.mytestapplication.model.Repository
import ru.lukmanov.mytestapplication.model.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve : MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl())
    : ViewModel() {

    fun getLiveData() = liveDataToObserve
    fun getWeatherFromRemoteSource() = getDataFromLocalSource(isRussian = true)
    fun getWeatherFromLocalSourceRus() = getDataFromLocalSource(isRussian = true)
    fun getWeatherFromLocalSourceWorld()  = getDataFromLocalSource(isRussian = false)

    private fun getDataFromLocalSource(isRussian : Boolean) {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(2000)
            liveDataToObserve.postValue(AppState.Success(
                if (isRussian)
                    repositoryImpl.getWeatherFromLocalStorageRus()
                else
                    repositoryImpl.getWeatherFromLocalStorageWorld()))
        }.start()
    }
}