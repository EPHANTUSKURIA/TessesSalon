package com.example.tessessalon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityBookingBinding
import com.example.tessessalon_app.databinding.ActivityMassageBinding

class Massage : AppCompatActivity() {

    private lateinit var binding: ActivityMassageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMassageBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}