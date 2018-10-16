package com.kotlin.cursos.views

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
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
    }
}
