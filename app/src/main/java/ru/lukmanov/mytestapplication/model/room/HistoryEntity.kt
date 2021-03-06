package ru.lukmanov.mytestapplication.model.room

import androidx.room.*

@Entity
data class HistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val city: String,
    val temperature: Int,
    val condition: String
)