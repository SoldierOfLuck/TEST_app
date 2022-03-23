package ru.lukmanov.mytestapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = -7,
    val feelsLike: Int = -12,
    val humidity: Int = 86,
    val wind: Int = 11,
    val uv: String = "Low"
): Parcelable

fun getDefaultCity() = City("Москва", 55.755826, 37.617299900000035)

fun getRussianCities() = listOf(
        Weather(
            City("Москва", 55.755826, 37.617299900000035), 1, 2,
            85, 11),
        Weather(
            City("Санкт-Петербург", 59.9342802, 30.335098600000038), 3,
            3, 88, 6),
        Weather(
            City("Новосибирск", 55.00835259999999, 82.93573270000002), 5,
            6, 75, 3),
        Weather(
            City("Екатеринбург", 56.83892609999999, 60.60570250000001), 7,
            8, 67, 1),
        Weather(
            City("Нижний Новгород", 56.2965039, 43.936059), 9, 10,
             78, 7),
        Weather(
            City("Казань", 55.8304307, 49.06608060000008), 11, 12,
            78, 5),
        Weather(
            City("Челябинск", 55.1644419, 61.4368432), 13, 14,
            66, 10),
        Weather(
            City("Омск", 54.9884804, 73.32423610000001), 15, 16,
            80, 9),
        Weather(
            City("Ростов-на-Дону", 47.2357137, 39.701505), 17, 18,
            83, 7),
        Weather(
            City("Уфа", 54.7387621, 55.972055400000045), 19, 20,
            87, 11)
    )

fun getWorldCities() = listOf(
        Weather(City("Лондон", 51.5085300, -0.1257400), 1, 2),
        Weather(City("Токио", 35.6895000, 139.6917100), 3, 4),
        Weather(City("Париж", 48.8534100, 2.3488000), 5, 6),
        Weather(City("Берлин", 52.52000659999999, 13.404953999999975), 7, 8),
        Weather(City("Рим", 41.9027835, 12.496365500000024), 9, 10),
        Weather(City("Минск", 53.90453979999999, 27.561524400000053), 11, 12),
        Weather(City("Стамбул", 41.0082376, 28.97835889999999), 13, 14),
        Weather(City("Вашингтон", 38.9071923, -77.03687070000001), 15, 16),
        Weather(City("Киев", 50.4501, 30.523400000000038), 17, 18),
        Weather(City("Пекин", 39.90419989999999, 116.40739630000007), 19, 20)
    )