package com.example.tessessalon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityMassageBinding
import com.example.tessessalon_app.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}