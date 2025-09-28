package com.example.practicas.views

import android.annotation.SuppressLint
import android.icu.text.CaseMap
import android.text.Layout
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicas.R
import com.example.practicas.components.TitleBar
import kotlinx.coroutines.internal.OpDescriptor



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TBView(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) { }
    TBContentView(navController)
}

@Composable
fun CarruselIamgenesTB() {
    val imagenes = listOf(
        R.drawable._1jqc4ned6bkgr1z8c0w,
        R.drawable.baker_mayfield_mike_evans_bucky_irving_090325,
        R.drawable.mike_evans_baker_mayfeild_640x381
    )

    LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(imagenes) { imagen ->
            Image(painter = painterResource(id = imagen), contentDescription = "Lions", modifier = Modifier.size(400.dp))
        }
    }
}


@Composable
fun CarruselCartasTB() {
    val cartas = listOf(
        Juego(R.drawable.philadelphia_eagles_logo, "Philadelphia Eagles"),
        Juego(R.drawable.seattle_seahawks_logo_transparent, "Seattle Seahawks"),
        Juego(R.drawable.san_francisco_49ers_logo_png_seeklogo_241798, "San Francisco 49ers"),
        Juego(R.drawable.detroit_lions_logo_transparent, "Detroit Lions"),
        Juego(R.drawable.new_orleans_saints_logo_svg, "New Orleans Saints"),
        Juego(R.drawable.new_england_patriots_logo_svg, "New England Patriots"),
        Juego(R.drawable.buffalo_bills_logo_transparent, "Buffalo Bills"),
        Juego(R.drawable.new_los_angeles_rams_logo_png_seeklogo_386951, "Los Angeles Rams"),
        Juego(R.drawable.arizona_cardinals_logo_transparent, "Arizona Cardinals"),
        Juego(R.drawable.new_orleans_saints_logo_svg, "New Orleans Saints"),
        Juego(R.drawable.atlanta_falcons_logo_transparent, "Atlanta Falcons"),
        Juego(R.drawable.carolina_panthers_logo_transparent, "Carolina Panthers"),
        Juego(R.drawable.carolina_panthers_logo_transparent, "Carolina Panthers")
    )

    LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(cartas) { Juego ->
            ElevatedCard(modifier = Modifier.width(250.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
                Image(painter = painterResource(id = Juego.imageRes), contentDescription = "ImagenEquipo", modifier = Modifier.size(100.dp).align(Alignment.CenterHorizontally))
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = Juego.title)
                }

            }

        }
    }
}

@Composable
fun CarruselCartas2TB() {
    val cartas = listOf(
        Juego(R.drawable.atlanta_falcons_logo_transparent, "W 23-20 Atlanta Falcons"),
        Juego(R.drawable.houston_texans_logo_transparent, "W 20-19 Texans"),
        Juego(R.drawable.new_york_jets_logo_2019, "W 29-27 Jets")
    )

    LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(cartas) { Juego ->
            ElevatedCard(modifier = Modifier.width(250.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
                Image(painter = painterResource(id = Juego.imageRes), contentDescription = "ImagenEquipo", modifier = Modifier.size(100.dp).align(Alignment.CenterHorizontally))
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = Juego.title)
                }

            }

        }
    }
}

@Composable
fun JugadoresTB() {
    val cartas = listOf(
        Juego(R.drawable._052587, "Baker Mayfield"),
        Juego(R.drawable.i__3_, "Mike Evans"),
        Juego(R.drawable.i__4_, "Lavonte David")
    )

    LazyRow (horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ){
        items(cartas) { Juego ->
            ElevatedCard(modifier = Modifier.width(250.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
                Image(painter = painterResource(id = Juego.imageRes), contentDescription = "ImagenEquipo", modifier = Modifier.size(100.dp).align(Alignment.CenterHorizontally))
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = Juego.title)
                }

            }

        }
    }
}




@Composable
fun TBContentView(navController: NavController) {
    Box(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxSize().padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            ElevatedCard(modifier = Modifier.width(250.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
                Text(text = "Buccaneers", fontSize = 35.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif, modifier = Modifier.align(
                    Alignment.CenterHorizontally))

            }
        }

        Box(modifier = Modifier.fillMaxSize().padding(top = 45.dp)){
            CarruselIamgenesTB()
        }


        Row(modifier = Modifier.fillMaxSize().padding(top = 445.dp),
            horizontalArrangement = Arrangement.Center) {
            ElevatedCard(modifier = Modifier.width(375.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Text(text = "Baker Mayfield tiene la oportunidad de consolidarse como QB franquicia. El reto es mantener la consistencia para que los Bucs sean algo más que un equipo de media tabla.", fontSize = 15.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)

            }
        }

        Row(modifier = Modifier.fillMaxSize().padding(top = 385.dp),
            horizontalArrangement = Arrangement.Start) {
            ElevatedCard(modifier = Modifier.width(130.dp).height(50.dp),  colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = "Record: 3-0", fontSize = 16.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)
                }
            }
        }
        Row(modifier = Modifier.fillMaxSize().padding(top = 385.dp),
            horizontalArrangement = Arrangement.End) {
            ElevatedCard(modifier = Modifier.width(245.dp).height(50.dp),  colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = "Campeones de la NFC Sur", fontSize = 16.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)
                }
            }
        }

        Text(text = "Proximos partidos:", modifier = Modifier.fillMaxSize().padding(top = 590.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 625.dp),
            horizontalArrangement = Arrangement.Center) {
            CarruselCartasTB()
        }

        Text(text = "Resultados:", modifier = Modifier.fillMaxSize().padding(top = 770.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 810.dp),
            horizontalArrangement = Arrangement.Center) {
            CarruselCartas2TB()
        }

        Text(text = "Jugadores importantes:", modifier = Modifier.fillMaxSize().padding(top = 960.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 1000.dp),
            horizontalArrangement = Arrangement.Center) {
            JugadoresTB()
        }
    }




}