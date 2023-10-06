package com.example.mathsapi.linkedIn

data class Languages(
    val primary_locale: PrimaryLocale,
    val profile_languages: ProfileLanguages,
    val supported_locales: List<SupportedLocale>
)