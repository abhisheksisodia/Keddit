package com.abhisheksisodia.weatherkot.domain.commands

import com.abhisheksisodia.weatherkot.data.ForecastRequest
import com.abhisheksisodia.weatherkot.domain.Command
import com.abhisheksisodia.weatherkot.domain.mappers.ForecastDataMapper
import com.abhisheksisodia.weatherkot.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}