package com.example.airtime.data

import com.example.airtime.R
import com.example.airtime.model.Product

object DataSource {
    val products: List<Product> = listOf(
        Product(R.drawable.bella, "Bella", "Small", 5000),
        Product(R.drawable.faye, "Faye", "Big", 10000),
        Product(R.drawable.frankie, "Frankie", "Medium", 7500)
    )
}