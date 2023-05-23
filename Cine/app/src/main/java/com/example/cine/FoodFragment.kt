package com.example.cine


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView



class FoodFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View?{

        val rootView = inflater.inflate(R.layout.fragment_food, container, false)
        val listView : ListView = rootView.findViewById(R.id.foodList)

        val foodData = arrayOf("Palomitas",
                                "Refresco",
                                "Combo1",
                                "Combo 2")

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, foodData)
        listView.adapter = adapter
        return rootView

    }


}