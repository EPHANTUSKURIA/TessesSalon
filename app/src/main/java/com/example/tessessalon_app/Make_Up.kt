package com.example.tessessalon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityMakeUpBinding

class Make_Up : AppCompatActivity() {
    private lateinit var binding: ActivityMakeUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMakeUpBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}