package com.example.sistemacontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class cursos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)
        supportActionBar?.title = "Cursos"
    }
}