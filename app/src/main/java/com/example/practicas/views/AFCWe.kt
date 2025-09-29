package com.example.practicas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.components.MainIconButton
import com.example.practicas.components.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AFCWeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Equipos")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                ), navigationIcon={
                    MainIconButton(icon = Icons.AutoMirrored.Filled.ArrowBack){
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        AFCWeContentView(navController)
    }
}

@Composable
fun AFCWeContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFB4F14)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFF002244))) {
            Icon(
                painter = painterResource(id = R.drawable.denver_broncos_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)

            )

            Text("Broncos", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0080C6)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFFFC20E))) {
            Icon(
                painter = painterResource(id = R.drawable.los_angeles_chargers_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Chargers",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("CF")}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE31837)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFFFFFFF))) {
            Icon(
                painter = painterResource(id = R.drawable.kansas_city_chiefs_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Chiefs",  color = Color(0xFFF7EF8A))
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)), shape = RoundedCornerShape(10.dp),  border = BorderStroke(3.dp, Color(0xFFFFFFFF))) {
            Icon(
                painter = painterResource(id = R.drawable._699530395_8_01),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Raiders",  color = Color.White)
        }
    }
}