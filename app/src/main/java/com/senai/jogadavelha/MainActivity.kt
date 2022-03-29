package com.senai.jogadavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.senai.jogadavelha.R.layout.activity_main


public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //aqui vamos pegar o button do xml e vamos dar uma ação que no caso vai executar a função
        //que ja foi estabelecida
    val buttonJogadorVsCpu = findViewById<Button>(R.id.buttonJogadorVsCpu)
        buttonJogadorVsCpu.setOnClickListener{

            dificuldadeSelecao()
        }
    val buttonJogadorVsJogador = findViewById<Button>(R.id.buttonJogadorVsJogador)
        buttonJogadorVsJogador.setOnClickListener{

            selecao()
        }
    }

    //aqui pegamos as outras pages como difficulty e colocamos um start que vai ser ativado acima

    public fun dificuldadeSelecao(){
        val difficulty = Intent(this,difficulty::class.java)
        startActivity(difficulty)
    }
    public fun selecao(){
        val selecao = Intent(this,selecao::class.java)
        startActivity(selecao)
    }
}