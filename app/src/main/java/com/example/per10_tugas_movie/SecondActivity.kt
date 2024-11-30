package com.example.per10_tugas_movie

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Find views by ID
        val imageView: ImageView = findViewById(R.id.imageView)
        val titleTextView: TextView = findViewById(R.id.titleTextview)
        val ratingTextView: TextView = findViewById(R.id.ratingTextView)
        val genreTextView: TextView = findViewById(R.id.genreTextView)
        val durationTextView: TextView = findViewById(R.id.durationTextView)
        val descTextView: TextView = findViewById(R.id.descTextView)

        // Retrieve data from intent
        val movieImage = intent.getIntExtra("movieImage", R.drawable.venom) // Use a default image
        val movieTitle = intent.getStringExtra("movieTitle") ?: "No Title"
        val movieRating = intent.getStringExtra("movieRating") ?: "No Rating"
        val movieDuration = intent.getStringExtra("movieDuration") ?: "No Duration"
        val movieGenre = intent.getStringExtra("movieGenre") ?: "No genre"
        val movieDesc = intent.getStringExtra("movieDesc") ?: "No Description"

        // Set the retrieved data to views
        imageView.setImageResource(movieImage)
        titleTextView.text = movieTitle
        ratingTextView.text = movieRating
        genreTextView.text = movieGenre
        durationTextView.text = movieDuration
        descTextView.text = movieDesc
    }
}
