package com.example.fragments.Activities

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.fragments.Fragments.DataFragment
import com.example.fragments.Fragments.DetailsFragment
import com.example.fragments.R

class MainActivity : FragmentActivity(), DataFragment.DataLister {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun enviarDatos(text: String) {
        val dFragment =
            supportFragmentManager.findFragmentById(R.id.detailsFragment) as DetailsFragment
        dFragment.renderizar(text)
    }
}