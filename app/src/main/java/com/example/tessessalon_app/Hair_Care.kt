package com.example.tessessalon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityHairCareBinding

class Hair_Care : AppCompatActivity() {
    private lateinit var binding: ActivityHairCareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityHairCareBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}