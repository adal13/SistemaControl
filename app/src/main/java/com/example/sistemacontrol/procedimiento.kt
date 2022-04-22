package com.example.sistemacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class procedimiento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procedimiento)
        supportActionBar?.title = "Procedimientos"

        var rl_lava_mano=findViewById<RelativeLayout>(R.id.rl_lava_mano)
        rl_lava_mano.setOnClickListener {
            var lanzar = Intent (this, lavamano::class.java)
            startActivity(lanzar)
        }

        var rl_cubreboca=findViewById<RelativeLayout>(R.id.rl_cubreboca)
        rl_cubreboca.setOnClickListener {
            var lanzar = Intent(this, usocubreboca::class.java)
            startActivity(lanzar)
        }

        var rl_embarazo=findViewById<RelativeLayout>(R.id.rl_embarazo)
        rl_embarazo.setOnClickListener {
            var lanzar = Intent(this, embarazo::class.java)
            startActivity(lanzar)
        }

        var rl_emergencia=findViewById<RelativeLayout>(R.id.rl_emergencia)
        rl_emergencia.setOnClickListener {
            var lanzar = Intent(this, emergencia::class.java)
            startActivity(lanzar)
        }

        var rl_uso_guantes=findViewById<RelativeLayout>(R.id.rl_uso_guantes)
        rl_uso_guantes.setOnClickListener {
            var lanzar = Intent(this, usoguantes::class.java)
            startActivity(lanzar)
        }
    }
}