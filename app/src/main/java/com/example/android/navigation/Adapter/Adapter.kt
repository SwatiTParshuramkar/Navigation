package com.example.android.navigation.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.android.navigation.R

class Adapter(val ctx : Context, val movieList:List<Movie>):  RecyclerView.Adapter<Adapter.MovieViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_adapter, parent, false)
        return MovieViewHolder(view)
        }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        holder.MovieName.text = movieList[position].title
        holder.MovieYear.text = movieList[position].year.toString()


//          Click listener on mainLayout is another method to pass object like onclick function which we declared.
//        holder.mainLayout.setOnClickListener {
//            Toast.makeText(ctx,movieList[position].title,Toast.LENGTH_SHORT).show()
//
//        }
    }

    override fun getItemCount():Int{
        return movieList.size
    }

    inner class MovieViewHolder(itemview :View) :RecyclerView.ViewHolder(itemview),View.OnClickListener{
        val MovieName :TextView = itemView.findViewById(R.id.movieName)
        val MovieYear:TextView = itemView.findViewById(R.id.year)
        val mainLayout :LinearLayout = itemView.findViewById(R.id.mainLayout)

        init {
            mainLayout.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            when(v?.id){
                R.id.mainLayout -> {
                    val movieName = movieList[adapterPosition].title
                    Toast.makeText(ctx,movieName,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
