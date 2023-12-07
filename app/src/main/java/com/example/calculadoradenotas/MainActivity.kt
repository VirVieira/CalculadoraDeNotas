package com.example.calculadoradenotas

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular :Button = findViewById(R.id.Calcular)
        val resultado :TextView = findViewById(R.id.resultado)
        val nota1 :EditText = findViewById(R.id.nota1)
        val nota2 :EditText = findViewById(R.id.nota2)
        val faltas :EditText = findViewById(R.id.faltas)


        btCalcular.setOnClickListener {

            val notaA: Int = Integer.parseInt(nota1.text.toString())
            val notaB: Int = Integer.parseInt(nota2.text.toString())
            val media: Int = (notaA + notaB) / 2
            val faltas1: Int = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas1 <= 10) {
                resultado.setText("Aluno Aprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("Aluno Reprovado\nNota Final:$media\nFaltas:")
                resultado.setTextColor(Color.RED)
            }
        }


    }
}


