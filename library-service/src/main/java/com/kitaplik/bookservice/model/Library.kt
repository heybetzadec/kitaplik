package com.kitaplik.bookservice.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
data class Library(
        @Id
        @Column(name = "library_id")
        @GeneratedValue(strategy = GenerationType.UUID)
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String? = "",

        @ElementCollection
        val userBook: List<String> = ArrayList<String>()
)
