package com.example.practicas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicas.ui.theme.Orange
import com.example.practicas.ui.theme.lightGray

@Composable
fun Calculadora(
    estado: Estados,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (Calculos) -> Unit
){
    Box(modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = estado.numero1 + (estado.operacion?.caracter ?: "") + estado.numero2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Boton(
                    caracter = "AC",
                    modifier = Modifier
                        .background(lightGray)
                        .aspectRatio(2f)
                        .weight(2f)
                    , onClick = {
                        onAction(Calculos.Limpiar)
                    }
                )
                Boton(
                    caracter = "Del",
                    modifier = Modifier
                        .background(lightGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Borrar)
                    }
                )
                Boton(
                    caracter = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Operacion(Operaciones.Division))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Boton(
                    caracter = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(7))
                    }
                )
                Boton(
                    caracter = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(8))
                    }
                )
                Boton(
                    caracter = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(9))
                    }
                )
                Boton(
                    caracter = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Operacion(Operaciones.Multiplicacion))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Boton(
                    caracter = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(4))
                    }
                )
                Boton(
                    caracter = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(5))
                    }
                )
                Boton(
                    caracter = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(6))
                    }
                )
                Boton(
                    caracter = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Operacion(Operaciones.Resta))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Boton(
                    caracter = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(1))
                    }
                )
                Boton(
                    caracter = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(2))
                    }
                )
                Boton(
                    caracter = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(3))
                    }
                )
                Boton(
                    caracter = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Operacion(Operaciones.Suma))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Boton(
                    caracter = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Numero(0))
                    }
                )
                Boton(
                    caracter = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Decimal)
                    }
                )
                Boton(
                    caracter = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                    , onClick = {
                        onAction(Calculos.Calcular)
                    }
                )
            }
        }
    }
}