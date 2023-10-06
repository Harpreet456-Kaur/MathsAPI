package com.example.mathsapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MathsInstance {
// Maths API
//    fun mathsInstance() : Retrofit{
//        return Retrofit.Builder().baseUrl("https://math6.p.rapidapi.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }

    // LinkedIn API
    fun mathsInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://linkedin-profiles-and-company-data.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}