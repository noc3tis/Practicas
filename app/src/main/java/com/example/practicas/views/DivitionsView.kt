package com.example.practicas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.practicas.components.TitleBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DivitionsView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Divisiones de la AFC")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        }
    ) {
        DivitionsContentView(navController)
    }
}

@Composable
fun DivitionsContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {navController.navigate("AFCWe")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.afc_west_main_image_hubpages),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp)

            )

            Text("AFC Oeste", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("AFCNo")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.every_nfl_teams_biggest_draft_steal_afc_north),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp)
            )

            Text("AFC Norte",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("AFCSo")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.every_nfl_teams_biggest_draft_steal_afc_south),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp)
            )

            Text("AFC Sur",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("AFCEa")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.afc_east),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp)
            )

            Text("AFC Este",  color = Color.White)
        }
    }
}