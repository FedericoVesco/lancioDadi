package com.example.lanciodadiveschini

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityRisultato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_risultato)

        val mioRandom = intent.getIntExtra("RANDOM", -1)
        val textRisultato = findViewById<TextView>(R.id.textRisultato)
        val nVincente = random()

        if(mioRandom == nVincente){
            textRisultato.text = "Complimenti hai vinto!"
        }
        else{
            textRisultato.text = "Hai perso, ritenta"
        }

    }

    private fun random(): Int{
        return (1..6).random()
    }
}