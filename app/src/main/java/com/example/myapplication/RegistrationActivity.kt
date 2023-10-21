package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val btnlogin: Button = findViewById(R.id.btn_login)
        val i = Intent(this,LoginActivity::class.java)
        btnlogin.setOnClickListener {
            startActivity(i)
        }}
}
