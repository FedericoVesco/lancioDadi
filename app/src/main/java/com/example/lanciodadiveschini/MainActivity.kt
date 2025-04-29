package com.example.lanciodadiveschini

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnRoll = findViewById<Button>(R.id.btnRoll) //Recupera il pulsante
        //Imposta una condizione al click
        btnRoll.setOnClickListener {
            val mioRandom = random()
            lanciaIntent(mioRandom)
        }
    }

    private fun random(): Int{
        return (1..6).random()
    }

    private fun lanciaIntent(mioRandom: Int){ //Richiama il secondo activity (Lancia) passando il numero random
        val mioIntent = Intent(this, ActivityLancia::class.java)
        mioIntent.putExtra("RANDOM", mioRandom)
        startActivity(mioIntent)
    }
}