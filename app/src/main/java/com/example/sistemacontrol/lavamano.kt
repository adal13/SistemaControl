package com.example.sistemacontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class lavamano : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lavamano)
        supportActionBar?.title = "Lavar correctamente las manos"
    }
}