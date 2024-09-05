package com.Emirkanmaz.superherodictionary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.Emirkanmaz.superherodictionary.databinding.ActivityMainBinding
import com.Emirkanmaz.superherodictionary.databinding.ActivitySuperheroDetailBinding

class SuperheroDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuperheroDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySuperheroDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = intent

        val hero = intent.getSerializableExtra("hero") as Superhero

        if (hero == null) {
            // Handle the null case, e.g., show an error message or finish the activity
        } else {
            binding.imageView.setImageResource(hero.image)
            binding.nameTextView.text = hero.name
            binding.jobTextView.text = hero.job
        }


    }
}