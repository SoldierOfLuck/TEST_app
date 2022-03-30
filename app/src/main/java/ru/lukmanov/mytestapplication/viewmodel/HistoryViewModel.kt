package ru.lukmanov.mytestapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.lukmanov.mytestapplication.App.Companion.getHistoryDao
import ru.lukmanov.mytestapplication.repository.LocalRepository
import ru.lukmanov.mytestapplication.repository.LocalRepositoryImpl

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: LocalRepository =
        LocalRepositoryImpl(getHistoryDao())) : ViewModel() {
    fun getAllHistory() {
        historyLiveData.value = AppState.Loading
        historyLiveData.value =
            AppState.Success(historyRepository.getAllHistory())
    }
}