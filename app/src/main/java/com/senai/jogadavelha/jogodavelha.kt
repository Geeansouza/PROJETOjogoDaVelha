package com.senai.jogadavelha

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class jogodavelha : AppCompatActivity() {

    var gameover:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jogodavelha)

        //button de voltar para o memu
        val backmenu = findViewById<Button>(R.id.backmenu)
        backmenu.setOnClickListener{
            finish()
        }
    }

        fun clickbtn(view: View){
            val btnselected = view as ImageButton
            var idzero = 0
            when (btnselected.id){
                R.id.j1 -> idzero = 1
                R.id.j2 -> idzero = 2
                R.id.j3 -> idzero = 3
                R.id.j4 -> idzero = 4
                R.id.j5 -> idzero = 5
                R.id.j6 -> idzero = 6
                R.id.j7 -> idzero = 7
                R.id.j8 -> idzero = 8
                R.id.j9 -> idzero = 9

            }
            if (gameover == false){
        playGame(idzero, btnselected)
            }
        }
            var player1 = ArrayList<Int>()
            var player2 = ArrayList<Int>()

            //definição de turno
            var activePlayer = 1

            fun playGame (idzero:Int, btnselected:ImageButton){
                if(activePlayer == 1){
                    btnselected.setImageResource(R.drawable.x)

                    player1.add(idzero)
                    activePlayer = 2
                }
                else{
                    btnselected.setImageResource(R.drawable.o)
                    player2.add(idzero)
                    activePlayer = 1
                }
                btnselected.isEnabled=false
                checkWinner()
        }

    fun checkWinner () {
        var winner = -1

        ///////////////////////////////////////////Horizontal////////////////////////////////
        //horizontal 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }
        //horizontal 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }
        //horizontal 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }
        ////////////////////////////////////Vertical//////////////////////////////////////////

        //vertical 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }
        //vertical 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }
        //vertical 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }
        /////////////////////////////////////////Diagonal///////////////////////////////////////////////

        //Diagonal 1
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner = 1
        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner = 2
        }
        //vDiagonal 2
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            winner = 1
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner = 2
        }
        //////////////////////////////////////////winner////////////////////////////////////////////////
        if(winner!=-1){
            if(winner ==1){
                Toast.makeText(this, "Player 1 Win the Games!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Player 2 Win the Games!" , Toast.LENGTH_SHORT).show()
            }
            gameover = true
        }
    }


}