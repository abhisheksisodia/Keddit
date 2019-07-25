package com.abhisheksisodia.weatherkot.domain

interface Command<out T> {
    fun execute(): T
}