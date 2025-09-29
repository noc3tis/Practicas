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
fun AFCSoView(navController: NavController){
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
        AFCSoContentView(navController)
    }
}

@Composable
fun AFCSoContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF006778)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFF9F792C))) {
            Icon(
                painter = painterResource(id = R.drawable.jacksonville_jaguars_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)

            )

            Text("Jaguars", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF002C5F)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFA2AAAD))) {
            Icon(
                painter = painterResource(id = R.drawable.indianapolis_colts_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Colts",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("Tex")}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA71930)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFF03202f))) {
            Icon(
                painter = painterResource(id = R.drawable.houston_texans_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Texans",  color = Color(0xFFF7EF8A))
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4B92DB)), shape = RoundedCornerShape(10.dp),  border = BorderStroke(3.dp, Color(0xFF8A8D8F))) {
            Icon(
                painter = painterResource(id = R.drawable.tennessee_titans_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Titans",  color = Color.White)
        }
    }
}