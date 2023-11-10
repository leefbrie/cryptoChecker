package com.example.cryptoapp.data.model

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images: List<String>
)

data class ApiResponse(
    val products: List<Product> = emptyList(),
    val total: Int = 0,
    val skip: Int? = 0,
    val limit: Int = 0,
)
