package com.example.projetodesomadenumeros
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var resultadoTextView: TextView
    private lateinit var exibirResultadoButton: Button
    private lateinit var espacoResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultadoTextView = findViewById(R.id.resultadoTextView)
        exibirResultadoButton = findViewById(R.id.exibirResultadoButton)
        espacoResultado = findViewById(R.id.espacoResultado)

        exibirResultadoButton.setOnClickListener {
            resultadoTextView.visibility = View.VISIBLE
            espacoResultado.text = resultadoTextView.text
        }

        val resultado = intent.getIntExtra("resultado", 0)
        resultadoTextView.text = resultado.toString()
    }
}


