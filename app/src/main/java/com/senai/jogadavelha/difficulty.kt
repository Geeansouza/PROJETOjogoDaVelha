package com.senai.jogadavelha

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class difficulty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.difficulty)

//aqui vamos pegar o button do xml e vamos dar uma ação que no caso vai executar a função
        //que ja foi estabelecida
        val facil = findViewById<Button>(R.id.buttonFacil)
        facil.setOnClickListener{

            jogodavelha()

        }
    }

    //aqui pegamos as outras pages como difficulty e colocamos um start que vai ser ativado acima

    public fun jogodavelha(){
        val jogodavelha = Intent(this,jogodavelha::class.java)
        startActivity(jogodavelha)
    }
}