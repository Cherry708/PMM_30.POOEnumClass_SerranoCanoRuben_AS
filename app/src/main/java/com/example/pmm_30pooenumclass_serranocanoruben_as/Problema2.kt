package com.example.pmm_30pooenumclass_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_30pooenumclass_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMultiplication.setOnClickListener {
            val number0 = binding.etNumber20.text.toString().toInt()
            val number1 = binding.etNumber21.text.toString().toInt()
            val operacion = Operacion(number0,number1 ,Operaciones.MULTIPLICACION)
            binding.tvResult20.text = operacion.operar().toString()
        }
    }
}

enum class Operaciones(val operacion:String){
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}
class Operacion(val number0:Int, val number1:Int, val operacion:Operaciones){
    fun operar():Int{
        var resultado = 0
        when(this.operacion){
            Operaciones.SUMA -> resultado = number0+number1
            Operaciones.RESTA -> resultado = number0-number1
            Operaciones.MULTIPLICACION -> resultado = number0*number1
            Operaciones.DIVISION -> resultado = number0/number1
        }
        return resultado
    }
}