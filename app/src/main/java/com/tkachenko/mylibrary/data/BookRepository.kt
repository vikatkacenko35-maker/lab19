package com.tkachenko.mylibrary.data

import androidx.compose.ui.graphics.vector.ImageVector
import com.tkachenko.mylibrary.R

object BookRepository {
    val books = listOf(
        Book(
            id = "1",
            title = "Война и мир",
            author = "Лев Толстой",
            year = 1869,
            genre = "Роман-эпопея",
            rating = 4.8f,
            description = "Масштабное произведение, охватывающее жизнь русского общества в эпоху наполеоновских войн.",
            coverResId = R.drawable.book1
        ),
        Book(
            id = "2",
            title = "Преступление и наказание",
            author = "Фёдор Достоевский",
            year = 1866,
            genre = "Роман",
            rating = 4.9f,
            description = "История студента Раскольникова, решившего проверить свою теорию о праве сильной личности.",
            coverResId = R.drawable.book2
        ),
        Book(
            id = "3",
            title = "Мастер и Маргарита",
            author = "Михаил Булгаков",
            year = 1967,
            genre = "Мистический роман",
            rating = 4.9f,
            description = "Сатана прибывает в Москву 1930-х годов, сея хаос и раскрывая человеческие пороки.",
            coverResId = R.drawable.book3
        ),
        Book(
            id = "4",
            title = "Анна Каренина",
            author = "Лев Толстой",
            year = 1877,
            genre = "Роман",
            rating = 4.7f,
            description = "Трагическая история любви замужней дамы и блестящего офицера Вронского.",
            coverResId = R.drawable.book4
        ),
        Book(
            id = "5",
            title = "Идиот",
            author = "Фёдор Достоевский",
            year = 1869,
            genre = "Роман",
            rating = 4.6f,
            description = "Князь Мышкин — человек редкой доброты и искренности — сталкивается с жестокостью петербургского света.",
            coverResId = R.drawable.book5
        )
    )

    fun getBookById(id: String): Book? = books.find { it.id == id }
}