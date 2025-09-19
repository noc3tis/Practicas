package com.example.practicas

sealed class Operaciones(val caracter: String) {
    object Suma: Operaciones("+")
    object Resta: Operaciones("-")
    object Multiplicacion: Operaciones("*")
    object Division: Operaciones("/")
}