package `in`.day1.weatherapp.models

import java.io.Serializable

data class WeatherResponse(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Int,
    val wind: Wind,
    val rain: Any,
    val clouds: Clouds,
    val dt: Int,
    val sys: Sys,
    val timezone: Int,
    val id: Int,
    val name: String,
    val cod: Int
): Serializable

data class Coord(
    val lon: Double,
    val lat: Double
): Serializable

data class Weather(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
): Serializable
data class Main(
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Int,
    val humidity: Int,
    val sea_level: Int,
    val gmd_level: Int
): Serializable

data class Wind(
    val Speed: Double,
    val deg: Int,
    val gust: Double
): Serializable


data class Clouds(
    val all: Int
): Serializable

data class Sys(
    val country: String,
    val type: Int,
    val id: Int,
    val sunrise: Long,
    val sunset: Long
)


