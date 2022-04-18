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
    }
}