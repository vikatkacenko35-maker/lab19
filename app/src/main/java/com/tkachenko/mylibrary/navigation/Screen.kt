package com.tkachenko.mylibrary.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details/{bookId}") {
        fun createRoute(bookId: String) = "details/$bookId"
    }
}