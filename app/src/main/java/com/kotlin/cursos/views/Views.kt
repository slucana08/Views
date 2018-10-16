package com.kotlin.cursos.views

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_views.*

class Views : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views)

        var nombres: Array<String> = arrayOf("Sting","Christian","Jose",
                "Davis","Erlin","Pedro","Victor","Giancarlo","Miguel",
                "Rodrigo","Jose","Alejandro","Marco","Viejo","Micho")
        var nombreAdapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,nombres)
        nombres_ListView.adapter = nombreAdapter

        detalle_Button.setOnClickListener{
            var myIntent = Intent(this,RecyclerActivity::class.java)
            startActivity(myIntent)
        }

        mostrar_Button.setOnClickListener{
            var mostrarAlert = AlertDialog.Builder(this)
            mostrarAlert.setTitle("Alerta")
            mostrarAlert.setMessage("Mensaje de Alerta")
            mostrarAlert.setPositiveButton("Si"){
                dialog: DialogInterface?, i : Int -> Toast.makeText(this,"Si desea",
                    Toast.LENGTH_SHORT).show()
            }
            mostrarAlert.setNegativeButton("No"){
                dialog: DialogInterface?, i : Int -> Toast.makeText(this,"No desea",
                    Toast.LENGTH_SHORT).show()
            }
            mostrarAlert.setNeutralButton("Después te aviso"){
                dialog: DialogInterface?, i : Int -> Toast.makeText(this,"Luego",
                    Toast.LENGTH_SHORT).show()
            }
            mostrarAlert.show()
        }
    }
}
