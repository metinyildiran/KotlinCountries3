package com.example.kotlincountries3.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlincountries3.model.Country

class CountryViewModel : ViewModel() {

    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom(){
        val country = Country("Norway", "Europe", "Oslo", "NOK", "Norwegian", "www.website.no")

        countryLiveData.value = country
    }

}