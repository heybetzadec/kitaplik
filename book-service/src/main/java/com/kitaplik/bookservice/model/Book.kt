package com.kitaplik.bookservice.model

import jakarta.persistence.*

@Entity
@Table(name = "books")
data class Book @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "UUID", strategy = GenerationType.UUID)
    val id: String? = "",
    val title: String = "",
    val bookYear: String = "",
    val pressName: String = "",,
    val author: String = "",
    val isbn: String = "",
)
