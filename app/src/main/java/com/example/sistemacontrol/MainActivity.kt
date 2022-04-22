package com.example.sistemacontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import java.util.HashMap

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login_entrar=findViewById<Button>(R.id.btn_login_entrar)

        val database = Firebase.database.reference

        btn_login_entrar.setOnClickListener {
            //Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()

            //Obtener los valores de las cajas de texto
            val txt_username=findViewById<EditText>(R.id.txt_username).text
            val txt_password=findViewById<EditText>(R.id.txt_password).text


            //Validar espacios en blanco
            if(txt_username.toString().equals("") or txt_password.toString().equals(""))
            {
                Toast.makeText(this, "Hay elementos vacio ", Toast.LENGTH_SHORT).show()
            }
            else
            {
                //Obtener usuario de firebase
                val consulta=database.child("registros_usuario_sistema").orderByChild("usuario").equalTo(txt_username.toString())
                //Conectarse a Firebase
                consulta.addListenerForSingleValueEvent(object: ValueEventListener{
                    override fun onDataChange(snapshot: DataSnapshot) {
                        //Resultados aqui
                        //Si existe el usuario escrito
                        if(snapshot.exists())
                        {
                            //Ver usuario y pass
                            var resultados = snapshot.children
                            lateinit var pass_firebase : String //Decirle que vamos a darle un valor mas adelante

                            //Buscar el elemento contraseña
                            for (datos in resultados){
                                val map=datos.getValue() as HashMap<String, Any>
                                pass_firebase = map.get("contrasena").toString()
                            }

                            //validar contraseña
                            if(txt_password.toString().equals(pass_firebase))
                            {
                                //Que entre a la aplicacion
                                entrarAlSistema()
                            }
                            else
                            {
                                generarMensaje("Usuario y/o contraseña incorrectos")
                            }

                        }
                        else
                        {
                            //No hay un usuario con ese nombre
                            generarMensaje("Usuario y/o contraseña incorrectos")
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        //Existe algun error
                        generarMensaje("Ocurrio un error al consultar los datos")
                    }
                })


                //username=admin
                //password=1234
                //*if (txt_username.toString().equals("equipo1") && txt_password.toString().equals("1234") )
                //{
                    //Cerrar la ventana de login
                    //this.finish()
                    //val index=Intent(this, index::class.java)
                    //startActivity(index)
                //}
                //else
                //{
                    //Toast.makeText(this, "Datos incorrectos",Toast.LENGTH_SHORT).show()
                //}
            }



            //val lanzar = Intent (this, index::class.java)
            //startActivity(lanzar)
        }
    }

    private fun generarMensaje(mensaje : String)
    {
        Toast.makeText(this, mensaje,Toast.LENGTH_SHORT).show()
    }
    private  fun entrarAlSistema(){
        this.finish()
        val index=Intent(this, index::class.java)
        startActivity(index)
    }

}