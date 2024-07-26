package com.example.mvvvmsampleapp.utils

interface LoginListner {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}