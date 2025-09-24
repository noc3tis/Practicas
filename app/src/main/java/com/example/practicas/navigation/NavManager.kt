package com.example.practicas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practicas.views.AFCEaView
import com.example.practicas.views.AFCNoView
import com.example.practicas.views.AFCSoView
import com.example.practicas.views.AFCWeView
import com.example.practicas.views.DivitionsView
import com.example.practicas.views.HomeView
import com.example.practicas.views.LionsView
import com.example.practicas.views.NFCEaView
import com.example.practicas.views.NFCNoView
import com.example.practicas.views.NFCSoView
import com.example.practicas.views.NFCView
import com.example.practicas.views.NFCWeView
import com.example.practicas.views.SplashScreen
import com.example.practicas.views.TBView

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "Splash",) {
        composable (route = "Home") {
            HomeView(navController)
        }
        composable (route = "Splash"){
            SplashScreen(navController)
        }

        composable (route = "DAFC"){
            DivitionsView(navController)
        }

        composable (route = "NFC"){
            NFCView(navController)
        }

        composable (route = "AFCSo"){
            AFCSoView(navController)
        }

        composable (route = "AFCNo"){
            AFCNoView(navController)
        }

        composable (route = "AFCWe"){
            AFCWeView(navController)
        }

        composable (route = "AFCEa"){
            AFCEaView(navController)
        }

        composable (route = "NFCWe"){
            NFCWeView(navController)
        }

        composable (route = "NFCEa"){
            NFCEaView(navController)
        }

        composable (route = "NFCSo"){
            NFCSoView(navController)
        }

        composable (route = "NFCNo"){
            NFCNoView(navController)
        }
        composable (route = "Lions"){
            LionsView(navController)
        }

        composable (route = "TB"){
            TBView(navController)
        }
    }
}