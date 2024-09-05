package com.Emirkanmaz.superherodictionary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.Emirkanmaz.superherodictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var superheroList: List<Superhero>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val batman = Superhero("Batman", "CEO", R.drawable.batman)
        val spiderman = Superhero("Spider-Man", "Student", R.drawable.spiderman)
        val superman = Superhero("Superman", "Journalist", R.drawable.superman)
        superheroList = listOf(batman,spiderman,superman)

        val adapter = SuperheroAdapter(superheroList)
        binding.superheroRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.superheroRecyclerView.adapter = adapter

    }


}