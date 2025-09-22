package com.example.practicas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicas.views.HomeView
import com.example.practicas.views.SplashScreen

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "Splash",) {
        composable (route = "Home") {
            HomeView(navController)
            HomeView(navController)
        }
        composable (route = "Splash"){
            SplashScreen(navController)
        }
    }
}