package com.example.per10_tugas_movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.per10_tugas_movie.databinding.FragmentHomeBinding


class homeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterMovie = MovieAdapter(generateDummy()) { movie ->
            val intent = Intent(requireContext(), SecondActivity::class.java).apply {
                putExtra("movieImage", movie.image)
                putExtra("movieTitle", movie.nameMovie)
                putExtra("movieRating", movie.movieRating)
                putExtra("movieGenre",movie.movieGenre)
                putExtra("movieDuration", movie.movieDuration)
                putExtra("movieDesc", movie.movieDesc)
            }
            startActivity(intent)
        }

        with(binding) {
            rvMovie.apply {
                adapter = adapterMovie
                layoutManager = GridLayoutManager(context,2)
            }
        }
    }


    fun generateDummy():List<Movie>{
        return listOf(
            Movie(image = R.drawable.venom , nameMovie = "Venom: the last dance", movieDuration = "1h 49m", movieRating = "R13+", movieGenre = "action", movieDesc = "The latest installment in the Venom series, titled Venom: The Last Dance, follows Eddie Brock and his symbiotic partner Venom as they embark on a road trip adventure with high-stakes action and emotional depth. The film takes them across various locations, including Las Vegas, where they encounter both old friends and new foes. The plot centers on the emergence of a deadly alien species, the Xenophages, which threatens Earth. Eddie and Venom face a climactic showdown at Area 51, leading to significant sacrifices to protect the planet"),
            Movie(image = R.drawable.musyrik, nameMovie = "Dosa Musyrik", movieDuration = "2h 59m", movieRating = "D 137+", movieGenre = "Horror", movieDesc = "The Indonesian horror movie Dosa Musyrik, directed by Hadrah Daeng Ratu and written by Bayu Kurnia, delves into supernatural terror linked to forbidden practices. The story follows characters such as Nugie, Tari, and Mbah Narto, who face unsettling hauntings and eerie occurrences after venturing into acts that defy religious teachings, particularly centered on the sin of \"musyrik\" (polytheism or idolatry). Produced by MVP Pictures, the film features Marthino Lio, Delia Husein, and Yati Surachman and blends horror with moral and religious themes in a haunting narrative"),
            Movie(
                image = R.drawable.inside_out,
                nameMovie = "Inside Out",
                movieDuration = "1h 35m",
                movieRating = "PG",
                movieGenre = "Animation, Adventure, Comedy",
                movieDesc = "Inside Out follows the story of Riley, a young girl who moves to a new city and has to adapt to her new life. Her emotions—Joy, Sadness, Anger, Fear, and Disgust—guide her through this transition, each trying to take control in the face of challenging changes. The movie dives into the complexities of growing up, showcasing how emotions interact and influence our decisions and memories."
            ),
            Movie(
                image = R.drawable.transformers,
                nameMovie = "Transformers One",
                movieDuration = "2h 14m",
                movieRating = "PG-13",
                movieGenre = "Action, Sci-Fi, Adventure",
                movieDesc = "Transformers One is a thrilling origin story of the conflict between Autobots and Decepticons on Cybertron. The movie explores how Optimus Prime and Megatron were once allies, before becoming the leaders of warring factions. Set against epic battles and alliances, Transformers One unveils the sacrifices and heroism that shaped these iconic characters in a cosmic struggle."
            ),Movie(image = R.drawable.venom , nameMovie = "Venom: the last dance", movieDuration = "1h 49m", movieRating = "R13+", movieGenre = "action", movieDesc = "The latest installment in the Venom series, titled Venom: The Last Dance, follows Eddie Brock and his symbiotic partner Venom as they embark on a road trip adventure with high-stakes action and emotional depth. The film takes them across various locations, including Las Vegas, where they encounter both old friends and new foes. The plot centers on the emergence of a deadly alien species, the Xenophages, which threatens Earth. Eddie and Venom face a climactic showdown at Area 51, leading to significant sacrifices to protect the planet"),
            Movie(image = R.drawable.musyrik, nameMovie = "Dosa Musyrik", movieDuration = "2h 59m", movieRating = "D 137+", movieGenre = "Horror", movieDesc = "The Indonesian horror movie Dosa Musyrik, directed by Hadrah Daeng Ratu and written by Bayu Kurnia, delves into supernatural terror linked to forbidden practices. The story follows characters such as Nugie, Tari, and Mbah Narto, who face unsettling hauntings and eerie occurrences after venturing into acts that defy religious teachings, particularly centered on the sin of \"musyrik\" (polytheism or idolatry). Produced by MVP Pictures, the film features Marthino Lio, Delia Husein, and Yati Surachman and blends horror with moral and religious themes in a haunting narrative"),
            Movie(
                image = R.drawable.inside_out,
                nameMovie = "Inside Out",
                movieDuration = "1h 35m",
                movieRating = "PG",
                movieGenre = "Animation, Adventure, Comedy",
                movieDesc = "Inside Out follows the story of Riley, a young girl who moves to a new city and has to adapt to her new life. Her emotions—Joy, Sadness, Anger, Fear, and Disgust—guide her through this transition, each trying to take control in the face of challenging changes. The movie dives into the complexities of growing up, showcasing how emotions interact and influence our decisions and memories."
            ),
            Movie(
                image = R.drawable.transformers,
                nameMovie = "Transformers One",
                movieDuration = "2h 14m",
                movieRating = "PG-13",
                movieGenre = "Action, Sci-Fi, Adventure",
                movieDesc = "Transformers One is a thrilling origin story of the conflict between Autobots and Decepticons on Cybertron. The movie explores how Optimus Prime and Megatron were once allies, before becoming the leaders of warring factions. Set against epic battles and alliances, Transformers One unveils the sacrifices and heroism that shaped these iconic characters in a cosmic struggle."
            ),
        )
    }

}