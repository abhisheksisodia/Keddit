package com.abhisheksisodia.weatherkot.domain.model

data class ForecastList(
    val city: String, val country: String,
    private val dailyForecast: List<Forecast>
) {

    //property for easy access
    val size: Int
        get() = dailyForecast.size

    //operator overloading
    operator fun get(position: Int): Forecast = dailyForecast[position]
}

data class Forecast(
    val date: String, val description: String, val high: Int, val low: Int,
    val iconUrl: String
)