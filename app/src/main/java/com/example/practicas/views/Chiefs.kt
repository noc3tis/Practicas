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
fun ChiefsView(navController: NavController){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White,
    ) { }
    ChiefsContentView(navController)
}

@Composable
fun CarruselIamgenesChiefs() {
    val imagenes = listOf(
        R.drawable.cf1,
        R.drawable.cf2,
        R.drawable.cf3
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
fun CarruselCartasChiefs() {
    val cartas = listOf(
        Juego(R.drawable.baltimore_ravens_logo_transparent, "Baltimore Ravens"),
        Juego(R.drawable.jacksonville_jaguars_logo_transparent, "Jacksonville Jaguars"),
        Juego(R.drawable.detroit_lions_logo_transparent, "Detroit Lions"),
        Juego(R.drawable.las_vegas_raiders_logo_1982, "Las Vegas Raiders"),
        Juego(R.drawable.washington_commanders_logo_svg, "Washington Commanders"),
        Juego(R.drawable.buffalo_bills_logo_transparent, "Buffalo Bills"),
        Juego(R.drawable.denver_broncos_logo_transparent, "Denver Broncos"),
        Juego(R.drawable.indianapolis_colts_logo_svg, "Indianapolis Colts"),
        Juego(R.drawable.dallas_cowboys_svg, "Dallas Cowboys"),
        Juego(R.drawable.houston_texans_logo_transparent, "Houston Texans"),
        Juego(R.drawable.los_angeles_chargers_logo_svg, "Los Angeles Chargers"),
        Juego(R.drawable.denver_broncos_logo_transparent, "Denver Broncos"),
        Juego(R.drawable.las_vegas_raiders_logo_1982, "Las Vegas Raiders"),

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
fun CarruselCartas2Chiefs() {
    val cartas = listOf(
        Juego(R.drawable.los_angeles_chargers_logo_svg, "L 27-21 Los Angeles Chargers"),
        Juego(R.drawable.philadelphia_eagles_logo, "L 20-17 Philadelphia Eagles"),
        Juego(R.drawable.new_york_giants_logo_svg, "W 22-9 New York Giants")
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
fun JugadoresChiefs() {
    val cartas = listOf(
        Juego(R.drawable.cf6, "Patrick Mahomes"),
        Juego(R.drawable.cf5, "Travis Kelce"),
        Juego(R.drawable.cf4, "Chris Jones")
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
fun ChiefsContentView(navController: NavController) {
    Box(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxSize().padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            ElevatedCard(modifier = Modifier.width(350.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
                Text(text = "Kansas City Chiefs", fontSize = 35.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif, modifier = Modifier.align(
                    Alignment.CenterHorizontally))

            }
        }

        Box(modifier = Modifier.fillMaxSize().padding(top = 45.dp)){
            CarruselIamgenesChiefs()
        }


        Row(modifier = Modifier.fillMaxSize().padding(top = 445.dp),
            horizontalArrangement = Arrangement.Center) {
            ElevatedCard(modifier = Modifier.width(375.dp), colors = CardDefaults.cardColors(containerColor = Color.White), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)){
                Text(text = "Con Mahomes, siempre estarán en la élite. Sin embargo, 2025 será un examen de profundidad: ¿pueden seguir dominando con receptores inexpertos y una defensa que a veces se queda corta? Mahomes tiene la capacidad de elevar a todos, pero no puede hacerlo solo eternamente.", fontSize = 15.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)

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
                    Text(text = "Campeones de la AFC Oeste", fontSize = 16.sp, color = Color(0xFF000000), fontFamily = FontFamily.Serif)
                }
            }
        }

        Text(text = "Proximos partidos:", modifier = Modifier.fillMaxSize().padding(top = 595.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 625.dp),
            horizontalArrangement = Arrangement.Center) {
            CarruselCartasChiefs()
        }

        Text(text = "Resultados:", modifier = Modifier.fillMaxSize().padding(top = 770.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 810.dp),
            horizontalArrangement = Arrangement.Center) {
            CarruselCartas2Chiefs()
        }

        Text(text = "Jugadores importantes:", modifier = Modifier.fillMaxSize().padding(top = 960.dp))

        Row(modifier = Modifier.fillMaxSize().padding(top = 1000.dp),
            horizontalArrangement = Arrangement.Center) {
            JugadoresChiefs()
        }
    }




}