package com.example.tessessalon_app

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityBridalBinding

class Bridal : AppCompatActivity() {

    private lateinit var binding:ActivityBridalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBridalBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}