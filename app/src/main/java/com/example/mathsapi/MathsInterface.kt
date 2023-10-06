package com.example.mathsapi

import com.example.mathsapi.linkedIn.Company
import com.example.mathsapi.linkedIn.School
import com.example.mathsapi.utils.CommonKeys.API_CONTENT
import com.example.mathsapi.utils.CommonKeys.API_HOST
import com.example.mathsapi.utils.CommonKeys.API_KEY
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface MathsInterface {

    @POST("generate")
      @Headers(
    "X-RapidAPI-Key:$API_KEY",
    "X-RapidAPI-Host:$API_HOST",
    "X-RapidAPI-CONTENT:$API_CONTENT"
)
    fun getData(@Body gson: String): Call<MathsData>

//    @POST("profile-details")
//    @Headers(
//        "X-RapidAPI-Key:$API_KEY",
//        "X-RapidAPI-Host:$API_HOST",
//        "X-RapidAPI-CONTENT:$API_CONTENT"
//    )
//    fun getData(@Body gson: String): Call<School>
}