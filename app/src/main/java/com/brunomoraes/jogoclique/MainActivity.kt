package com.brunomoraes.jogoclique

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background // Correção: Certificando-se de importar corretamente
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // Importando a classe Color corretamente
import androidx.compose.ui.unit.sp
import com.brunomoraes.jogoclique.ui.theme.JogoCliqueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JogoCliqueTheme {
                // Aplicando fundo preto no Box
                Box(
                    modifier = Modifier
                        .fillMaxSize()  // Preenche toda a tela
                        .background(Color.Black), // Aplica fundo preto
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "🚀",  // Emoji
                        fontSize = 96.sp,   // Tamanho do emoji
                        color = Color.White // Cor do emoji (branco)
                    )
                }
            }
        }
    }
}
