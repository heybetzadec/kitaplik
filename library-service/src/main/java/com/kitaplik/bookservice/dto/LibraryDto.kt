package com.kitaplik.bookservice.dto

class LibraryDto @JvmOverloads constructor(
        val id: String,
        val userBookList: List<BookDto>? = ArrayList()
)