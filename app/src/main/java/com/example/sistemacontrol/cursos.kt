package com.example.sistemacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class cursos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)
        supportActionBar?.title = "Cursos"

        var rl_anatomia=findViewById<RelativeLayout>(R.id.rl_anatomia)
        rl_anatomia.setOnClickListener {
            var lanzar = Intent(this, anatomia::class.java)
            startActivity(lanzar)
        }

        var rl_fisiologia=findViewById<RelativeLayout>(R.id.rl_fisiologia)
        rl_fisiologia.setOnClickListener {
            var lanzar = Intent (this, fisiologia :: class.java)
            startActivity(lanzar)
        }

        var rl_embriologia=findViewById<RelativeLayout>(R.id.rl_embriologia)
        rl_embriologia.setOnClickListener {
            var lanzar = Intent(this, embriologia::class.java)
            startActivity(lanzar)
        }

        var rl_urgencia=findViewById<RelativeLayout>(R.id.rl_urgencias)
        rl_urgencia.setOnClickListener {
            var lanzar = Intent(this, urgencia::class.java)
            startActivity(lanzar)
        }

        var rl_geriatria=findViewById<RelativeLayout>(R.id.rl_geriatria)
        rl_geriatria.setOnClickListener {
            var lanzar = Intent(this, geriatria::class.java)
            startActivity(lanzar)
        }

        var rl_neonatologia=findViewById<RelativeLayout>(R.id.rl_neonatologia)
        rl_neonatologia.setOnClickListener {
            var lanzar = Intent(this, neonatologia::class.java)
            startActivity(lanzar)
        }
    }
}