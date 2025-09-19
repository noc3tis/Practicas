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
import androidx.compose.foundation.layout.Spacer
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
                    Interfaz()
                }
            }
        }
    }
}

data class valoresISR(
    val limiteInferior: Double,
    val limiteSuperior: Double,
    val cuotaFija: Double,
    val porcentajeExcedente: Double
)

val ISRs = listOf(
    valoresISR(0.01, 746.04, 0.00, 1.92),
    valoresISR(746.04, 6332.05, 14.32, 6.40),
    valoresISR(6332.06, 11128.01, 371.83, 10.88),
    valoresISR(11128.02, 12935.82, 893.63, 16.00),
    valoresISR(12935.83, 15487.71, 1182.88, 17.92),
    valoresISR(15487.72, 31236.49, 1640.18, 21.36),
    valoresISR(31236.50, 49233.00, 5004.12, 23.52),
    valoresISR(49233.01, 93993.90, 9236.89, 30.00),
    valoresISR(93993.91, 125325.20, 22665.17, 32.00),
    valoresISR(125325.21, 375975.61, 32691.18, 34.00),
    valoresISR(375975.62, Double.MAX_VALUE, 117912.32, 35.00)
)

fun calcularISR(sueldo: Double, rangos: List<valoresISR>): Double {
    val rango = rangos.firstOrNull { sueldo in it.limiteInferior..it.limiteSuperior }
    return if (rango != null) {
        (sueldo - rango.limiteInferior) * (rango.porcentajeExcedente / 100)  + rango.cuotaFija
    } else 0.0
}


@Composable
fun Interfaz() {
    var texto by remember { mutableStateOf("") }
    var ISR by remember { mutableStateOf("") }
    var sueldo by remember { mutableStateOf("") }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        OutlinedTextField(
            value = texto,
            onValueChange = {texto = it},
            label = {Text(text = "Sueldo Diario")}
        )

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = ISR,
            onValueChange = {ISR = it},
            label = {Text(text = "ISR")},
            readOnly = true
        )

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = sueldo,
            onValueChange = {sueldo = it},
            label = {Text(text = "Sueldo")},
            readOnly = true
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Button(onClick = {
            val sueMens = texto.toDoubleOrNull() ?: 0.0
            val resultTemo = calcularISR(sueMens, ISRs)
            val result = sueMens - resultTemo

            ISR = String.format("%.2f", resultTemo)
            sueldo = String.format("%.2f", result)

        }, modifier = Modifier) {
            Text(text = "Calcular")
        }
    }
}