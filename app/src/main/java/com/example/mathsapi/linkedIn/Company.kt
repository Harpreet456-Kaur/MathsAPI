package com.example.mathsapi.linkedIn

data class Company(
    val employees: Employees,
    val id: Int,
    val logo: String,
    val name: String,
    val url: String
)