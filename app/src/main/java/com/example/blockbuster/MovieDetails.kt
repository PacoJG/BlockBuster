package com.example.blockbuster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.blockbuster.data.DBMovie
import com.example.blockbuster.databinding.ActivityMovieDetailsBinding
import com.example.blockbuster.model.Movie

class MovieDetails : AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailsBinding
    var id: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        if(savedInstanceState == null)
        {
            val bundle = intent.extras
            if( bundle != null ){
                id = bundle.getInt("id" , 0)
            }
            else {
                id = savedInstanceState?.getSerializable("id") as Int
            }
        }
        //Toast.makeText(this, id.toString(), Toast.LENGTH_LONG).show()


        val movie: List<Movie> = DBMovie.moviesList
        //Toast.makeText(this, movie[1].id.toString(), Toast.LENGTH_LONG).show()
        with(binding){
            when(movie[id-1].id){
                1 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.spiderman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                2 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.red)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                3 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.scream)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                4 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.uncharted)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                5 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.batman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                6 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.batman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                7 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.batman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                8 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.batman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                9 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.batman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
                10 -> {
                    val v1 = findViewById<VideoView>(R.id.vvTrailer)
                    v1.setVideoPath("android.resource://"+packageName+"/"+R.raw.batman)
                    val mc: MediaController = MediaController(this@MovieDetails)
                    mc.setAnchorView(v1)
                    v1.start()
                    v1.setMediaController(mc)
                }
            }
            tvTitleMovie.text = movie[id-1].title
            tvDescription.text = movie[id-1].description
            tvGenre.text = movie[id-1].genre
            tvDate.text = movie[id-1].date
        }

    }
}