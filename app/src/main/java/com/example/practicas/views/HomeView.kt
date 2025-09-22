package com.example.practicas.views

import com.example.practicas.R
import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicas.components.ActionButton
import com.example.practicas.components.TitleBar


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("NFLPedia")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Black
                )
            )
        }
    ) {
        ContentHomeView(navController)
    }
}

@Composable
fun ContentHomeView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {/*TODO*/}) {
            Icon(
                painter = painterResource(id = R.drawable.american_football_conference_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified
            )
            Text("Conferencia Americana")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {/*TODO*/}) {
            Icon(
                painter = painterResource(id = R.drawable.national_football_conference_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified
            )
            Text("Conferencia Americana")
        }
    }
}