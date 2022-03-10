package com.example.tessessalon_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tessessalon_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
        }
        binding.btnforgotPassword.setOnClickListener {
            startActivity(Intent(this,Register::class.java)
            )
        }
    }
}
 