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
fun NFCView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Divisiones de la NFC")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                )
            )
        }
    ) {
        NFCContentView(navController)
    }
}

@Composable
fun NFCContentView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedButton(onClick = {navController.navigate("NFCWe")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Blue), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.hu3coiuwmtzx1cadquwa),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)

            )

            Text("NFC Oeste", color = Color.White)

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("NFCNo")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Blue), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.north),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("NFC Norte",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("NFCSo")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Blue), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.xhtxcyfk0hyuxtn0axjo),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("NFC Sur",  color = Color.White)
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {navController.navigate("NFCEa")}, colors = ButtonDefaults.buttonColors(containerColor = Color.Blue), shape = RoundedCornerShape(10.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.limd0nqjfujwltsfvirq),
                contentDescription = "Entrar",
                tint = Color.Unspecified,
                modifier = Modifier.size(100.dp).padding(0.dp, 0.dp, 15.dp, 0.dp)
            )

            Text("NFC Este",  color = Color.White)
        }
    }
}