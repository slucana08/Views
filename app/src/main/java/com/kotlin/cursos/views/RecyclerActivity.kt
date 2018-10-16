package com.kotlin.cursos.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.kotlin.cursos.views.Model.Persona
import com.kotlin.cursos.views.Model.PersonaListAdapter
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    private var adapter : PersonaListAdapter? = null
    private var personaList : ArrayList<Persona>? = null
    private var layoutManager : RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        personaList = ArrayList<Persona>()
        layoutManager = LinearLayoutManager(this)
        adapter = PersonaListAdapter(personaList!!,this)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        var nombresList : Array<String> = arrayOf("Sting","Christian","Jose",
                "Davis","Erlin","Pedro","Victor","Giancarlo","Miguel",
                "Rodrigo","Jose","Alejandro","Marco")
        var apellidosList : Array<String> = arrayOf("Lucana","Sanchez","Perez",
                "Arroyo","Murrieta","Aquino","Gonzalez","Ravelo","Acuña",
                "Suarez","Perez","Barreto","Espinoza")

        var imageList : Array<Int> = arrayOf(R.drawable.bulbasaur,R.drawable.charizard,
                R.drawable.golem,R.drawable.gastly,R.drawable.growlithe,R.drawable.squirtle,
                R.drawable.rattata,R.drawable.pikachu,R.drawable.ninetales,R.drawable.kakuna,
                R.drawable.poliwrath,R.drawable.rhydon,R.drawable.persian)

        for (i in 0..nombresList.size-1){
            var persona = Persona()
            persona.nombres = nombresList[i]
            persona.apellidos = apellidosList[i]
            persona.image = imageList[i]
            personaList?.add(persona)
        }

    }
}
