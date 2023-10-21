package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnlogin: Button = findViewById(R.id.btn_login)
        val btnsignup: Button = findViewById(R.id.btn_signup)
        val ilogin = Intent(this, LoginActivity::class.java)
        btnlogin.setOnClickListener {
            startActivity(ilogin)
        }
       val isignup = Intent(this, RegistrationActivity::class.java)
        btnsignup.setOnClickListener {
            startActivity(isignup)

        }
    }
}

