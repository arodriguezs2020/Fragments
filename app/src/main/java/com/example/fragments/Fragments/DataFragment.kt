package com.example.fragments.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragments.R
import kotlin.Exception

class DataFragment : Fragment() {

    var llamada: DataLister? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        try {
            llamada = context as DataLister
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val miVista = inflater.inflate(R.layout.fragment_data, container, false)
        val editText = miVista.findViewById<EditText>(R.id.editTextData)
        val btnEnviar = miVista.findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val texto = editText.text.toString()
            llamada!!.enviarDatos(texto)
        }

        // Inflate the layout for this fragment
        return miVista
    }

    interface DataLister {
        fun enviarDatos(text: String)
    }
}