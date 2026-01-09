package com.example.primeirojogo

import android.os.Bundle
import android.graphics.Color
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Criamos o quadro negro direto pelo código para não ter erro de ID
        val quadroDoJogo = FrameLayout(this)
        quadroDoJogo.setBackgroundColor(Color.BLACK)

        // 2. Colocamos esse quadro na tela do seu Samsung
        setContentView(quadroDoJogo)

        // 3. Aviso no Logcat
        println("LOG: O motor do jogo de [SEU NOME] esta rodando e a tela deve estar PRETA!")
    }
}