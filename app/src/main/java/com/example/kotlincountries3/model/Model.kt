package com.example.kotlincountries3.model

import com.google.gson.annotations.SerializedName

data class Country(

    @SerializedName("name")
    val countryName: String?,
    @SerializedName("capital")
    val countryCapital: String?,
    @SerializedName("region")
    val countryRegion: String?,
    @SerializedName("language")
    val countryLanguage: String?,
    @SerializedName("currency")
    val countryCurrency: String?,
    @SerializedName("flag")
    val imageUrl: String?
)