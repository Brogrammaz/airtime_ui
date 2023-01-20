package com.example.airtime.model

import androidx.annotation.DrawableRes

data class Product(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val description: String,
    val price: Int
)