package com.example.kotlincountries3.service

import com.example.kotlincountries3.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {

    //https://raw.githubusercontent.com/Qubits3/KotlinCountries/master/countrydataset.json
    //BASE_URL = https://raw.githubusercontent.com/
    //EXT = Qubits3/KotlinCountries/master/countrydataset.json

    @GET("Qubits3/KotlinCountries/master/countrydataset.json")
    fun getCountries():Single<List<Country>>

}