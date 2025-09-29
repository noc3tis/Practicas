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
fun NFCNoView(navController: NavController){
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
        NFCNoContentView(navController)
    }
}

@Composable
fun NFCNoContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFc83803)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFF0B162A))) {
            Icon(
                painter = painterResource(id = R.drawable.chicago_bears_logo),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)

            )

            Text("Bears", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4F2683)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFFFC62F))) {
            Icon(
                painter = painterResource(id = R.drawable.minnesota_vikings_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Vikings",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("Lions")}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0076b6)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFB0B7BC))) {
            Icon(
                painter = painterResource(id = R.drawable.detroit_lions_logo_transparent),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Lions",  color = Color(0xFFF7EF8A))
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF203731)), shape = RoundedCornerShape(10.dp),  border = BorderStroke(3.dp, Color(0xFFFFB612))) {
            Icon(
                painter = painterResource(id = R.drawable.green_bay_packers_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Packers",  color = Color.White)
        }
    }
}