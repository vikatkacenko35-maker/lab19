package com.tkachenko.mylibrary.data

import androidx.annotation.DrawableRes

data class Book(
    val id: String,
    val title: String,
    val author: String,
    val year: Int,
    val genre: String,
    val rating: Float,
    val description: String,
    @DrawableRes val coverResId: Int
)
