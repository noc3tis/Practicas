package com.example.practicas

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )  {
                    Practica()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Practica() {
    var texto = remember { mutableStateOf("") }
    val context = LocalContext.current
    var valora by remember { mutableStateOf("") }
    var valorb by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            OutlinedTextField(
                value = texto.value,
                onValueChange = { texto.value = it },
                label = { Text("Nombre") },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
            )

        }
        Row() {
            Button(onClick = {/*TODO*/}) {
                Text("Enviar")
            }
        }
        Row(Modifier.padding(16.dp)){
            OutlinedTextField(
                value = valora,
                label = {Text("Primer Valor")},
                onValueChange = {valora = it}
            )


        }
        Row (Modifier.padding(16.dp)){
            OutlinedTextField(
                value = valorb,
                label = {Text("Segundo valor")},
                onValueChange = {valorb = it}
            )
        }
        Row(Modifier.align(Alignment.CenterHorizontally)) {
            OutlinedButton(onClick = {/*TODO*/
                val a = valora.toInt()
                val b = valorb.toInt()
                val c = a + b
                resultado = c.toString()
            }) {
                Text(text = "Enviar")
            }
        }
        Row(Modifier.padding(16.dp)){
            OutlinedTextField(
                value = resultado,
                label = {Text("Resultado")},
                onValueChange = {resultado = it}
            )
        }
    }
}