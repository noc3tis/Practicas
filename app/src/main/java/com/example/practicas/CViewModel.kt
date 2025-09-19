package com.example.practicas


import android.service.credentials.Action
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CViewModel: ViewModel() {
    var estado by mutableStateOf(Estados())
        private set

    fun onAction(action: Calculos){
        when(action){
            is Calculos.Numero -> enterNumber(action.numero)
            is Calculos.Decimal -> enterDecimal()
            is Calculos.Limpiar -> estado = Estados()
            is Calculos.Operacion -> enterOperation(action.operacion)
            is Calculos.Calcular -> performCalculation()
            is Calculos.Borrar -> performDeletion()
        }
    }

    private fun performDeletion() {
        when {
            estado.numero2.isNotBlank() -> estado = estado.copy(
                numero2 = estado.numero2.dropLast(1)
            )
            estado.operacion != null -> estado = estado.copy(
                operacion = null
            )
            estado.numero1.isNotBlank() -> estado = estado.copy(
                numero1 = estado.numero1.dropLast(1)
            )
        }
    }

    private fun performCalculation() {
        val numero1 = estado.numero1.toDoubleOrNull()
        val numero2 = estado.numero2.toDoubleOrNull()
        if (numero1 != null && numero2 != null){
            val resultado = when(estado.operacion) {
                is Operaciones.Suma -> numero1 + numero2
                is Operaciones.Resta -> numero1 - numero2
                is Operaciones.Multiplicacion -> numero1 * numero2
                is Operaciones.Division -> numero1 / numero2
                null -> return
            }
            estado = estado.copy(
                numero1 = resultado.toString().take(15),
                numero2 = "",
                operacion = null
            )
        }
    }

    private fun enterOperation(operacion: Operaciones) {
        if (estado.numero1.isNotBlank()){
            estado = estado.copy(operacion = operacion)
        }
    }

    private fun enterNumber(numero: Int) {
        if (estado.operacion == null){
            if (estado.numero1.length >= MAX_NUM_LENGTH){
                return
            }
            estado = estado.copy(
                numero1 = estado.numero1 + numero
            )
            return
        }
        if (estado.numero2.length >= MAX_NUM_LENGTH){
            return
        }
        estado = estado.copy(
            numero2 = estado.numero2 + numero
        )
    }

    companion object{
        private const val MAX_NUM_LENGTH = 8
    }

    private fun enterDecimal() {
        if (estado.operacion == null && !estado.numero1.contains(".") && estado.numero1.isNotBlank()){
            estado = estado.copy(
                numero1 = estado.numero1 + "."
            )
            return
        }
        if (estado.operacion == null && !estado.numero2.contains(".") && estado.numero2.isNotBlank()){
            estado = estado.copy(
                numero2 = estado.numero2 + "."
            )

        }
    }
}