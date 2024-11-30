package com.example.per10_tugas_movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.per10_tugas_movie.databinding.ItemMovieBinding

typealias OnClickMovie = (Movie) -> Unit
class MovieAdapter(private val listMovie: List<Movie>,private val onClickMovie: OnClickMovie) : RecyclerView.Adapter<MovieAdapter.ItemMovieViewHolder>() {
    inner class ItemMovieViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Movie) {
            with(binding) {
                txtMovieTitle.text = data.nameMovie
                txtRating.text = data.movieRating
                txtDuration.text = data.movieDuration // Changed to use movieDuration
                imgMovie.setImageResource(data.image)

                itemView.setOnClickListener {
                    with(binding) {
                        txtMovieTitle.text = data.nameMovie
                        txtRating.text = data.movieRating
                        txtDuration.text = data.movieDuration
                        imgMovie.setImageResource(data.image)

                        itemView.setOnClickListener {
                            onClickMovie(data) // Call the lambda function to handle the click
                        }
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemMovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemMovieViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }
}
