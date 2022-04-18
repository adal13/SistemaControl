package com.example.sistemacontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class contacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)
        supportActionBar?.title = "Contactanos"
    }
}