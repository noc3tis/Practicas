package com.example.practicas.views

import com.example.practicas.R
import android.annotation.SuppressLint
import androidx.compose.ui.graphics.Color
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        OutlinedButton(onClick = { navController.navigate("DAFC") }, colors = ButtonDefaults.buttonColors(containerColor = Color.Red), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.american_football_conference_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.padding(0.dp, 0.dp, 15.dp, 0.dp)
            )
            Text("Conferencia Americana", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("NFC")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Blue), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.national_football_conference_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.padding(0.dp, 0.dp, 10.dp, 0.dp)
            )
            Text("Conferencia Nacional",  color = Color.White)
        }
    }
}