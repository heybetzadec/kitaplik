package com.kitaplik.bookservice.dto


data class BookDto @JvmOverloads constructor(
    val bookId: BookIdDto? = null,
    val title: String = "",
    val year: Int = 0,
    val author: String = "",
    val pressName: String = ""
) {
//    companion object {
//        @JvmStatic
//        fun convert(from: Book): BookDto {
//            return BookDto(
//                from.id?.let { BookIdDto.convert(it, from.isbn) },
//                from.title,
//                from.bookYear,
//                from.author,
//                from.pressName
//            )
//        }
//    }
}
