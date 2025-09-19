package com.example.practicas

sealed class Calculos {
    data class Numero(val numero: Int): Calculos()
    object Limpiar: Calculos()
    object Borrar: Calculos()
    object Decimal: Calculos()
    object Calcular: Calculos()
    data class Operacion(val operacion: Operaciones): Calculos()
}