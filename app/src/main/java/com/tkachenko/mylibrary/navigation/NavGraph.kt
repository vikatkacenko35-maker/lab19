package com.tkachenko.mylibrary.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tkachenko.mylibrary.data.BookRepository
import com.tkachenko.mylibrary.ui.HomeScreen
import com.tkachenko.mylibrary.ui.DetailsScreen

@Composable
fun MyLibraryNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                books = BookRepository.books,
                onBookClick = { bookId ->
                    navController.navigate(Screen.Details.createRoute(bookId))
                }
            )
        }

        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("bookId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val bookId = backStackEntry.arguments?.getString("bookId")
            val book = BookRepository.getBookById(bookId.orEmpty())
            DetailsScreen(
                book = book,
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}