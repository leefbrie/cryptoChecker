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
    val products: List<Product>?,
    val total: Int?,
    val skip: Int?,
    val limit: Int?
)
