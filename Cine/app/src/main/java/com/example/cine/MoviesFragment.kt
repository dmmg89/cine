package com.example.cine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class MoviesFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_movies, container, false)
        val rootView = inflater.inflate(R.layout.fragment_movies, container, false)
        val listView: ListView = rootView.findViewById(R.id.moviesList)

        val moviesData = arrayOf(getString(R.string.Pelicula_1),
            getString(R.string.Pelicula_2),
            getString(R.string.Pelicula_3),
            getString(R.string.Pelicula_4),
            getString(R.string.Pelicula_5))

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, moviesData)
        listView.adapter = adapter

        return rootView
    }


}