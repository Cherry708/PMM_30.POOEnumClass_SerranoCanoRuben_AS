package com.example.pmm_30pooenumclass_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_30pooenumclass_serranocanoruben_as.databinding.ActivityProblema3Propuesto1Binding

class Problema3Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3_propuesto1)

        val binding = ActivityProblema3Propuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter30.setOnClickListener {
            val pais = PaisesSudamericanos.CHILE
            binding.tvResult30.text = pais.toString()
        }

    }
}
enum class PaisesSudamericanos(val poblacion:Int){
    COLOMBIA(7485732),
    CHILE(34552542),
    VENEZUELA(9874213)
}