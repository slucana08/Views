package com.kotlin.cursos.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kotlin.cursos.views.Model.Persona
import com.kotlin.cursos.views.Model.PersonaListAdapter
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    private var adapter : PersonaListAdapter? = null
    private var personaList : ArrayList<Persona>? = null
    private var layourManager : RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        personaList = ArrayList<Persona>()
        layourManager = LinearLayoutManager(this)
        adapter = PersonaListAdapter(personaList!!,this)

        recyclerView.layoutManager = layourManager
        recyclerView.adapter = adapter

        var nombreList : Array<String> = arrayOf("Sting","Christian","Jose",
                    "Davis","Erlin","Pedro","Victor","Giancarlo","Miguel",
                "Rodrigo","Jose","Alejandro","Marco","Viejo","Micho")
        var apellidosList : Array<String> = arrayOf("Lucana","Sanchez","Perez",
                "Arroyo","Murrieta","Aquino","Gonzalez","Ravelo","Acuña",
                "Suarez","Perez","Barreto","Espinoza","Perro","Gato")

        for (i in 0..nombreList.size - 1){
            var persona = Persona()
            persona.nombres = nombreList[i]
            persona.apellidos = apellidosList[i]
            personaList?.add(persona)
        }
    }
}
