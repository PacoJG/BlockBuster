package com.example.blockbuster.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.blockbuster.R
import com.example.blockbuster.model.Movie

class MovieViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val titleMovie = view.findViewById<TextView>(R.id.tvName)
    val genreMovie = view.findViewById<TextView>(R.id.tvGenre)
    val imageMovie = view.findViewById<ImageView>(R.id.ivMovie)

    fun render(movieModel: Movie, onClickListener: (Movie) -> Unit){
        titleMovie.text = movieModel.title
        genreMovie.text = movieModel.genre
        when(movieModel.id){
            1 -> imageMovie.setImageResource(R.drawable.spiderman)
            2 -> imageMovie.setImageResource(R.drawable.red)
            3 -> imageMovie.setImageResource(R.drawable.scream)
            4 -> imageMovie.setImageResource(R.drawable.uncharted)
            5 -> imageMovie.setImageResource(R.drawable.batman)
            6 -> imageMovie.setImageResource(R.drawable.sonic)
            7 -> imageMovie.setImageResource(R.drawable.ambulancia)
            8 -> imageMovie.setImageResource(R.drawable.ruega)
            9 -> imageMovie.setImageResource(R.drawable.cosasimposibles)
            10 -> imageMovie.setImageResource(R.drawable.sing2)
        }

        itemView.setOnClickListener{
            onClickListener(movieModel)
        }

    }
}