package com.example.sistemacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class index : AppCompatActivity() /*, NavigationView.OnNavigationItemSelectedListener */{

    /*private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        supportActionBar?.title = "Menu de opciones"
        //(this as AppCompatActivity).supportActionBar?.title = "Menu de opciones"

        /*val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout)

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView:NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)*/

         //Nos reenviara a la lista de pacientes
        val rl_info_paciente=findViewById<RelativeLayout>(R.id.rl_info_paciente)
        rl_info_paciente.setOnClickListener {
            val lanzar = Intent (this, infopaciente::class.java)
            startActivity(lanzar)
        }

        val rl_precedimiento=findViewById<RelativeLayout>(R.id.rl_procedimiento)
        rl_precedimiento.setOnClickListener{
            val lanzar = Intent(this, procedimiento::class.java)
            startActivity(lanzar)
        }

        val rl_cursos=findViewById<RelativeLayout>(R.id.rl_cursos)
        rl_cursos.setOnClickListener{
            val lanzar = Intent(this, cursos::class.java)
            startActivity(lanzar)
        }

        val rl_contactano=findViewById<RelativeLayout>(R.id.rl_contactanos)
        rl_contactano.setOnClickListener{
            val lanzar = Intent(this, contacto::class.java)
            startActivity(lanzar)
        }

        val rl_info_lugar=findViewById<RelativeLayout>(R.id.rl_info_lugar)
        rl_info_lugar.setOnClickListener{
            val lanzar = Intent(this, info_lugar::class.java)
            startActivity(lanzar)
        }

        val rl_politica_priv=findViewById<RelativeLayout>(R.id.rl_politica_priv)
        rl_politica_priv.setOnClickListener {
            val lanzar = Intent(this, privacidad::class.java)
            startActivity(lanzar)
        }

    }

    /*override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_item_one -> Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show()
            R.id.nav_item_two -> Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show()
            R.id.nav_item_three -> Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show()
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?){
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration){
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }*/

}