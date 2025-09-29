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
fun NFCWeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Equipos")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                ), navigationIcon={
                    MainIconButton(icon = Icons.AutoMirrored.Filled.ArrowBack){
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        NFCWeContentView(navController)
    }
}

@Composable
fun NFCWeContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF002244)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFF69BE28))) {
            Icon(
                painter = painterResource(id = R.drawable.seattle_seahawks_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)

            )

            Text("Seahawks", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFAA0000)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFB3995D))) {
            Icon(
                painter = painterResource(id = R.drawable.san_francisco_49ers_logo_png_seeklogo_241798),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("49ers",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("Rams")}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF003594)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFffa300))) {
            Icon(
                painter = painterResource(id = R.drawable.new_los_angeles_rams_logo_png_seeklogo_386951),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Rams",  color = Color(0xFFF7EF8A))
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF97233F)), shape = RoundedCornerShape(10.dp),  border = BorderStroke(3.dp, Color(0xFF000000))) {
            Icon(
                painter = painterResource(id = R.drawable.arizona_cardinals_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Cardinals",  color = Color.White)
        }
    }
}