package com.namekianaffairs.deezerapi

data class MyData(
    val `data`: List<Data>,
    val next: String,
    val total: Int
)