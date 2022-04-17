package com.example.sistemacontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.sistemacontrol.Manual.name
import com.example.sistemacontrol.Manual.people
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.HashMap

class infopaciente : AppCompatActivity() {

    var name_of_people= arrayListOf<String>()

    lateinit var list_users:ListView

    override fun onCreate(savedInstanceState: Bundle?) { //Aqui comienza el metodo onCreate
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infopaciente)
        supportActionBar?.title = "Lista de pacientes"
        //(this as AppCompatActivity).supportActionBar?.title = "Lista de pacientes"

        //enlazar elemento
        list_users=findViewById<ListView>(R.id.list_users)
        //val week_days= arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

        //Declarar un arreglo de objeto de tipo persona
        var people_arrangement=ArrayList<people>()


        //Conexion a la BD
        val database=Firebase.database.reference

        val escucha=object : ValueEventListener
        {
            override fun onDataChange(snapshot: DataSnapshot) {

                //val valor_fb=snapshot.getValue(String::class.java)
                var set=snapshot.children

                //Limpiar o vaciar los datos de name_of_people
                name_of_people.clear()

                for (dato in set)
                {
                    val map=dato.getValue() as HashMap <String,Any>
                    Log.d("Nombre Persona", map.get("nombre").toString())
                    //Llenar la lista con el nombre de las personas
                    name_of_people.add(map.get("nombre").toString())

                    //Llenar el arreglo de personas
                    people_arrangement.add(people(map.get("apellidomaterno").toString(),
                                                  map.get("apellidopaterno").toString(),
                                                  Integer.parseInt(map.get("edad").toString()),
                                                  map.get("fechadeingreso").toString(),
                                                  map.get("horadeingreso").toString(),
                                                  map.get("nombre").toString(),
                                                  Integer.parseInt(map.get("numerocama").toString())
                    ))
                }//Termina de leer todos los elementos en firebase
                fill_list()

            }

            override fun onCancelled(error: DatabaseError) {

            }
        }//Fin del escucha

        list_users.setOnItemClickListener{ adapterView, view, i, l ->
            val ventana_informacion=AlertDialog.Builder(this)
                .setTitle("Informacion del paciente")
                .setMessage("Apellido Paterno: "+people_arrangement.get(i).apellidopaterno+
                            "\nApellido Materno: "+people_arrangement.get(i).apellidomaterno+
                            "\nNombre: "+people_arrangement.get(i).nombre+
                            "\nEdad: "+people_arrangement.get(i).edad+
                            "\nNumero De Cama: "+people_arrangement.get(i).numerocama+
                            "\nFecha De Ingreso: "+people_arrangement.get(i).fechadeingreso+
                            "\nHora De Ingreso: "+people_arrangement.get(i).horadeingreso)
                .setCancelable(true)
                .create()
            ventana_informacion.show()
        }

        //val referencia=database.child("usuarios").child("usuario1").child("nombre")
        val referencia=database.child("registrospacientes")
        referencia.addValueEventListener(escucha)

    } //Aqui termina el metodo onCreate

    //Crear un metodo

    fun fill_list ()
    {
        val pattern=ArrayAdapter(this,android.R.layout.simple_list_item_1, name_of_people)
        list_users.adapter=pattern

    }

}