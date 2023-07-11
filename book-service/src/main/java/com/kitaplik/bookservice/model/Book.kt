package com.kitaplik.bookservice.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

//@JvmOverloads constructor

@Entity
@Table(name = "books")
data class Book (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,
    val title: String,
    val bookYear: Int,
    val pressName: String,
    val author: String,
    val isbn: String,
) {

    constructor(title:String, bookYear:Int, pressName:String, author:String, isbn:String) : this (null, title, bookYear, pressName, author, isbn) {

    }

    constructor(title:String, bookYear:Int, pressName:String, author:String) : this (null, title, bookYear, pressName, author, "") {

    }

    constructor() : this("", 2000,"","","") {

    }

}
