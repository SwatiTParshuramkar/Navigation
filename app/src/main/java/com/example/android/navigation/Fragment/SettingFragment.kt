package com.example.android.navigation.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.navigation.Adapter.Adapter
import com.example.android.navigation.Adapter.Movie
import com.example.android.navigation.R


class SettingFragment : Fragment() {

    private val  movieList = listOf(
        Movie("Marvels",2018),
        Movie("Cindrella",2021),
        Movie("Nam Shabaana",2018),
        Movie("Avengers",2018),
        Movie("Mumbai Dairies",2021),
        Movie("Bellbottom",2021),
        Movie("My girlfriend is alian",2017),
        Movie("I am not Robot",2018),
        Movie("Ghazi Attack",2010),
        Movie("Surkhi Bindi",2013),
        Movie("Mimi",20212),
        Movie("Article 15", 2019),
        Movie("Kabir Singh",2019),
        Movie("Nun",2018),
        Movie("Premachi Gosht", 2017),
        Movie("Sawarkhed Ek Gao", 2010),

    )

    lateinit var rcView :RecyclerView
    lateinit var layoutManager: LinearLayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcView = view.findViewById(R.id.rcView)
        layoutManager = LinearLayoutManager(requireActivity(),)
        rcView.layoutManager = layoutManager

        val adapterClass = Adapter(requireActivity(),movieList)
        rcView.adapter = adapterClass


    }

}