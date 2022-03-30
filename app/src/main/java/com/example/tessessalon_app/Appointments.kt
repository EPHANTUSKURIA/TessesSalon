package com.example.tessessalon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityAppointmentsBinding

class Appointments : AppCompatActivity() {
    private lateinit var  binding: ActivityAppointmentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityAppointmentsBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}