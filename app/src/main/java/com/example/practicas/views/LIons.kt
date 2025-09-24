package com.example.practicas.views

import android.annotation.SuppressLint
import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.components.TitleBar


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LionsView(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) { }
        LionsContentView(navController)
}

@Composable
fun LionsContentView(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(top = 35.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.padding(1.dp).border(2.dp, Color.Black, RoundedCornerShape(12.dp)).padding(horizontal = 24.dp, vertical = 12.dp)){
            Text(text = "Detroit Lions", fontSize = 35.sp, color = Color.Black, fontFamily = FontFamily.Serif)

        }
    }
    Row (modifier = Modifier.fillMaxSize().padding(top = 50.dp),
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable._920x0), contentDescription = "Lions", modifier = Modifier.size(400.dp))
    }
    Row(modifier = Modifier.fillMaxSize().padding(top = 445.dp),
        horizontalArrangement = Arrangement.Center) {
        Box(modifier = Modifier.padding(1.dp).border(2.dp, Color.Black, RoundedCornerShape(12.dp)).padding(horizontal = 24.dp, vertical = 12.dp)){
            Text(text = "Detroit ya no es sorpresa, es candidato. Goff, Amon-Ra y un juego terrestre poderoso hacen de los Lions un equipo sólido. La expectativa es clara: pelear por la NFC y demostrar que no son “one hit wonder”.", fontSize = 15.sp, color = Color.Black, fontFamily = FontFamily.Serif)

        }
    }

    Row(modifier = Modifier.fillMaxSize().padding(top = 385.dp),
        horizontalArrangement = Arrangement.Center) {
        Box(modifier = Modifier.padding(1.dp).border(2.dp, Color.Black, RoundedCornerShape(12.dp)).padding(horizontal = 24.dp, vertical = 12.dp)){
            Text(text = "Record: 2-1", fontSize = 15.sp, color = Color.Black, fontFamily = FontFamily.Serif)

        }
    }


}