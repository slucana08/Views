package com.kotlin.cursos.views.Model

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.kotlin.cursos.views.R

class PersonaListAdapter (private val list:ArrayList<Persona>,
                          private val context: Context):
        RecyclerView.Adapter<PersonaListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_card_view,
                parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(persona: Persona){
            var nombres = itemView.findViewById(R.id.nombres_TextView) as TextView
            var apellidos = itemView.findViewById(R.id.apellidos_TextView) as TextView
            nombres.text = persona.nombres
            apellidos.text = persona.apellidos
            itemView.setOnClickListener {
                Toast.makeText(context,"Su nombre es ${nombres.text.toString() + " " +
                apellidos.text.toString()}",Toast.LENGTH_SHORT).show()
            }
        }
    }
}