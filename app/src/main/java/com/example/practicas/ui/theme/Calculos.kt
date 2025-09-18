package com.example.practicas.ui.theme

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable
import kotlin.text.endsWith
import kotlin.text.replace

public class Calculos : ViewModel(){

    private val ecuacion = MutableLiveData("") //Guarda los valores
    val ListaEcuacion : LiveData<String> = ecuacion //Guarda los datos en una lista

    private val resultado = MutableLiveData("0") //Guarda los valores
    val ListaResultado : LiveData<String> = resultado
    fun onButtonClick(boton:String){
        ecuacion.value?.let {
            if (boton=="AC"){
                ecuacion.value = ""
                resultado.value = "0"
                return
            }

            if (boton=="C"){
                if(it.isNotEmpty()){
                    ecuacion.value = it.substring(0,it.length-1)
                }
                return
            }

            if (boton=="="){
                ecuacion.value = resultado.value
                return

            }

            ecuacion.value = it+boton
            try {
                resultado.value = calculos(ecuacion.value.toString())
            }catch (_ : Exception){}

        }
    }

    fun calculos(ecuacion: String) : String{
        val context : Context = Context.enter()
        context.optimizationLevel = -1
        val scriptable : Scriptable = context.initStandardObjects()
        var resultado = context.evaluateString(scriptable, ecuacion, "JavaScript", 1, null).toString()
        if (resultado.endsWith(".0")){
            resultado = resultado.replace(".0", "")
        }
        return resultado
    }
}
