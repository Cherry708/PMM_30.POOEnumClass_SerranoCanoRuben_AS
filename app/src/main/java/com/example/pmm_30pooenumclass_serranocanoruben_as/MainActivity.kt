package com.example.pmm_30pooenumclass_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_30pooenumclass_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnter10.setOnClickListener {
            val carta = Carta(TipoCarta.Picas)
            binding.tvResult10.text = carta.toString()
        }
    }
}
enum class TipoCarta{
    Corazones,
    Treboles,
    Diamantes,
    Picas
}
class Carta(val tipo:TipoCarta){
    override fun toString(): String {
        return "Carta de $tipo"
    }
}