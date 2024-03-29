package com.example.kotlincountries3.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.kotlincountries3.model.Country
import com.example.kotlincountries3.service.CountryDatabase
import kotlinx.coroutines.launch

class CountryViewModel(application: Application) : BaseViewModel(application) {

    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom(uuid: Int){
        launch {
            val dao = CountryDatabase(getApplication()).countryDao()
            val country = dao.getCountry(uuid)
            countryLiveData.value = country
        }
    }

}