package com.example.blockbuster.ui.movies

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.blockbuster.MovieDetails
import com.example.blockbuster.adapter.MovieAdapter
import com.example.blockbuster.data.DBMovie
import com.example.blockbuster.databinding.FragmentMoviesBinding
import com.example.blockbuster.model.Movie


class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            val tmp = LinearLayoutManager(requireContext())
            RecyclerMovies.layoutManager = tmp
            RecyclerMovies.adapter = MovieAdapter(DBMovie.moviesList) { movie ->
                onItemSelected(
                    movie
                )
            }
        }
    }

    private fun onItemSelected(movie: Movie){
        //Toast.makeText(requireContext(), "Movie: ${movie.title}", Toast.LENGTH_SHORT).show()
        val intent = Intent(activity,MovieDetails::class.java)
        intent.putExtra("id" , movie.id)
        startActivity(intent)
    }

}