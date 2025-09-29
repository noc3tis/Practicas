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
fun RavensView(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) { }
    RavensContentView(navController)
}

@Composable
fun CarruselIamgenesRavens() {
    val imagenes = listOf(
        R.drawable.rav5,
        R.drawable.rav6,
        R.drawable.rav4jpg
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
fun CarruselCartasRavens() {
    val cartas = listOf(
        Juego(R.drawable.kansas_city_chiefs_logo_transparent, "Kansas City Chiefs"),
        Juego(R.drawable.houston_texans_logo_transparent, "Houston Texans"),
        Juego(R.drawable.new_los_angeles_rams_logo_png_seeklogo_386951, "Los Angeles Rams"),
        Juego(R.drawable.chicago_bears_logo, "Chicago Bears"),
        Juego(R.drawable.miami_dolphins_logo_1997_2012, "Miami Dolphins"),
        Juego(R.drawable.minnesota_vikings_logo_transparent, "Minnesota Vikings"),
        Juego(R.drawable.cleveland_browns_logo_transparent, "Cleveland Browns"),
        Juego(R.drawable.new_york_jets_logo_2019, "New York Jets"),
        Juego(R.drawable.cincinnati_bengals_logo_svg, "Cincinnati Bengals"),
        Juego(R.drawable.pittsburgh_steelers_logo_svg, "Pittsburgh Steelers"),
        Juego(R.drawable.new_england_patriots_logo_svg, "New England Patriots"),
        Juego(R.drawable.green_bay_packers_logo_svg, "Green Bay Packers"),
        Juego(R.drawable.pittsburgh_steelers_logo_svg, "Pittsburgh Steelers"),

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
fun CarruselCartas2Ravens() {
    val cartas = listOf(
        Juego(R.drawable.buffalo_bills_logo_transparent, "L 41-40 Buffalo Bills"),
        Juego(R.drawable.cleveland_browns_logo_transparent, "W 41-17 Cleveland Browns"),
        Juego(R.drawable.detroit_lions_logo_transparent, "L 38-30 Detroit Lions")
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
fun JugadoresRavens() {
    val cartas = listOf(
        Juego(R.drawable.rav7, "Lamar Jackson"),
        Juego(R.drawable.rav8, "Mark Andrews"),
        Juego(R.drawable.rav9, "Derrick Henry")
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
fun RavensContentView(navController: NavController) {
    Box(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxSize().padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            ElevatedCard(modifier = Modifier.width(350.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
                Text(text = "Baltimore Ravens", fontSize = 35.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif, modifier = Modifier.align(
                    Alignment.CenterHorizontally))

            }
        }

        Box(modifier = Modifier.fillMaxSize().padding(top = 45.dp)){
            CarruselIamgenesRavens()
        }


        Row(modifier = Modifier.fillMaxSize().padding(top = 445.dp),
            horizontalArrangement = Arrangement.Center) {
            ElevatedCard(modifier = Modifier.width(375.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Text(text = "Lamar Jackson ha demostrado que puede ganar partidos casi solo, pero Baltimore quiere ser más que un equipo de temporada regular. Su temporada se mide en enero: todo menos llegar a la final de conferencia será un fracaso.", fontSize = 15.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)

            }
        }

        Row(modifier = Modifier.fillMaxSize().padding(top = 385.dp),
            horizontalArrangement = Arrangement.Start) {
            ElevatedCard(modifier = Modifier.width(130.dp).height(50.dp),  colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = "Record: 1-2", fontSize = 16.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)
                }
            }
        }
        Row(modifier = Modifier.fillMaxSize().padding(top = 385.dp),
            horizontalArrangement = Arrangement.End) {
            ElevatedCard(modifier = Modifier.width(245.dp).height(50.dp),  colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Text(text = "Campeones de la AFC Norte", fontSize = 16.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)
                }
            }
        }

        Text(text = "Proximos partidos:", modifier = Modifier.fillMaxSize().padding(top = 595.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 625.dp),
            horizontalArrangement = Arrangement.Center) {
            CarruselCartasRavens()
        }

        Text(text = "Resultados:", modifier = Modifier.fillMaxSize().padding(top = 770.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 810.dp),
            horizontalArrangement = Arrangement.Center) {
            CarruselCartas2Ravens()
        }

        Text(text = "Jugadores importantes:", modifier = Modifier.fillMaxSize().padding(top = 960.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 1000.dp),
            horizontalArrangement = Arrangement.Center) {
            JugadoresRavens()
        }
    }




}