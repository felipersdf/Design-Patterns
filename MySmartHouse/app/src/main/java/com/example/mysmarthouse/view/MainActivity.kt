package com.example.mysmarthouse.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mysmarthouse.R

class MainActivity : AppCompatActivity() {

    private lateinit var botaoLivingRoom: Button
    private lateinit var botaoKitchen: Button
    private lateinit var botaoBedRoom: Button
    val LIVING_ROOM = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.botaoLivingRoom = findViewById(R.id.MainButtonLivingRoom)
        this.botaoKitchen = findViewById(R.id.MainButtonKitchen)
        this.botaoBedRoom = findViewById(R.id.MainButtonBedRoom)

        this.botaoLivingRoom.setOnClickListener( { onClick(it) })
    }

    fun onClick(view: View){

        val mensagem = "Bem vindo à Sala de Estar!"
        val intent = Intent(this, LivingRoomActivity::class.java)
        intent.putExtra("MSG_SALA", mensagem)

        startActivityForResult(intent, LIVING_ROOM)
    }
}
