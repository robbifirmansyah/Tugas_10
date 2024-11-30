package com.example.per10_tugas_movie

import androidx.annotation.DrawableRes

data class Movie(
    @DrawableRes val image: Int,
    val nameMovie : String="",
    val movieDuration : String="",
    val movieRating : String="",
    val movieGenre : String="",
    val movieDesc : String=""
)
