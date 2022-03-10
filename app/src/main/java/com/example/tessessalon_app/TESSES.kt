package com.example.tessessalon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityTessesBinding

class TESSES : AppCompatActivity() {

    private lateinit var binding: ActivityTessesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTessesBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}