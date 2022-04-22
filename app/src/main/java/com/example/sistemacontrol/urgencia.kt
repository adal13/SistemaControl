package com.example.sistemacontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class urgencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urgencia)
        supportActionBar?.title="Urgencia"
    }
}