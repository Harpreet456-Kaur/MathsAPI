package com.example.mathsapi.linkedIn

data class PositionGroup(
    val company: Company,
    val date: DateX,
    val profile_positions: List<ProfilePosition>
)