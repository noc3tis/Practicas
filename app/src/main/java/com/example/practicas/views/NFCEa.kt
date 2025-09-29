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
fun NFCEaView(navController: NavController){
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
        NFCEaContentView(navController)
    }
}

@Composable
fun NFCEaContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF041E42)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFF7F9695))) {
            Icon(
                painter = painterResource(id = R.drawable.dallas_cowboys_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)

            )

            Text("Cowboys", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5A1414)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFFFB612))) {
            Icon(
                painter = painterResource(id = R.drawable.washington_commanders_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Commanders",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("Ea")}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF004C54)), shape = RoundedCornerShape(10.dp), border = BorderStroke(3.dp, Color(0xFFA5ACAF))) {
            Icon(
                painter = painterResource(id = R.drawable.philadelphia_eagles_logo),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Eagles",  color = Color(0xFFF7EF8A))
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {/*TODO*/}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0B2265)), shape = RoundedCornerShape(10.dp),  border = BorderStroke(3.dp, Color(0xFFa71930))) {
            Icon(
                painter = painterResource(id = R.drawable.new_york_giants_logo_svg),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("Giants",  color = Color.White)
        }
    }
}