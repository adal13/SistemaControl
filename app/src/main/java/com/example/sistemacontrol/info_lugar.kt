package com.example.sistemacontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class info_lugar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_lugar)
        supportActionBar?.title = "Informacion del Lugar"
    }
}