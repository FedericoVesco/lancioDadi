package com.example.lanciodadiveschini

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityLancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lancia)

        val mioRandom = intent.getIntExtra("RANDOM", -1)
        val btnContinua = findViewById<Button>(R.id.btnContinua)
        btnContinua.setOnClickListener {
            val mioToast = Toast.makeText(this, "Scopri se hai vinto!", Toast.LENGTH_SHORT)
            mioToast.show()
            lanciaIntent(mioRandom)
        }

        val dado = findViewById<ImageView>(R.id.dado)
        //Array associativo
        val dadi = when(mioRandom){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }

        dado.setImageResource(dadi as Int)
    }

    private fun lanciaIntent(mioRandom: Int){
        val mioIntent = Intent(this, ActivityRisultato::class.java)
        mioIntent.putExtra("RANDOM", mioRandom)
        startActivity(mioIntent)
    }
}