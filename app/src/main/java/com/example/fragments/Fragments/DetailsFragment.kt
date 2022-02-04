package com.example.fragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragments.R

class DetailsFragment : Fragment() {

    var textViewDetails: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val miVista = inflater.inflate(R.layout.fragment_details, container, false)
        // Inflate the layout for this fragment
        textViewDetails = miVista.findViewById(R.id.textViewDetails)
        return miVista
    }

    fun renderizar(texto: String) {
        textViewDetails?.text = texto
    }
}