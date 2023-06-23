package com.example.projetodesomadenumeros

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var numero1: EditText
    private lateinit var numero2: EditText
    private lateinit var bCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.editNumero1)
        numero2 = findViewById(R.id.editNumero2)
        bCalcular = findViewById(R.id.botao)

        bCalcular.setOnClickListener {
            val num1 = numero1.text.toString().toInt()
            val num2 = numero2.text.toString().toInt()
            val resultado = num1 + num2

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("resultado", resultado)
            startActivity(intent)
        }
    }
}

