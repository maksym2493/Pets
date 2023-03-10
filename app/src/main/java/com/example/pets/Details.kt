package com.example.pets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pets.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding) {
           val pet = intent.getParcelableExtra<Animal>("data")!!

            image.setImageResource(pet.image)

            name.text = pet.name
            description.text = pet.description
            fullDescription.text = pet.fullDescription
        }
    }
}