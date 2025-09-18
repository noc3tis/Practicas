package com.example.practicas

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicas.ui.theme.PracticasTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.practicas.ui.theme.Calculos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val calculatorViewModel = ViewModelProvider(this)[Calculos::class.java]
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Scaffold( modifier = Modifier.fillMaxSize())  { innerPadding ->
                    Calculadora(modifier = Modifier.padding(innerPadding), calculatorViewModel)
                }
            }
        }


    }

    val Botones = listOf(
        "C", "(", ")", "÷",
        "7", "8", "9", "*",
        "4", "5", "6", "+",
        "1", "2", "3", "-",
        "AC", "0", ".", "=",
    )

    @Composable
    fun Calculadora(modifier: Modifier = Modifier, viewModel: Calculos){

        val ecuacion = viewModel.ListaEcuacion.observeAsState();
        val resultado = viewModel.ListaResultado.observeAsState();

        Column (
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.End
        ){
            Text(text = ecuacion.value?:"",
                style = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.End
                ))

            Spacer(modifier = Modifier.height(150.dp))

            Text(text = resultado.value?:"",
                style = TextStyle(
                    fontSize = 60.sp,
                    textAlign = TextAlign.End
                ))

            Spacer(modifier = Modifier.height(10.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
            ) {
                items(Botones) {
                    BotonesCalculadora(boton = it, onClick = {
                        viewModel.onButtonClick(it)
                    })
                }
            }
        }
    }

    @Composable
    fun BotonesCalculadora(boton: String, onClick : ()-> Unit){
        Row (modifier = Modifier.padding(10.dp)) {
            FloatingActionButton(onClick = onClick,
                modifier = Modifier.size(80.dp),
                shape = CircleShape,
                containerColor = Color.Black
            ) {
                Text(text = boton,
                    color = getColor(boton),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
    }

    fun getColor(boton:String) : Color{
        if (boton == "C" || boton == "AC")
            return Color(0xFFFF0000)
        if (boton == "(" || boton == ")" || boton == "=")
            return Color(0xFFCCA600)
        if (boton == "÷" || boton == "*" || boton == "+" ||boton == "-")
            return Color(0xFF00A0CC)
        return Color(0xFFFAFAFA)
    }


}



