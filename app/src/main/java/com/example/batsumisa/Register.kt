package com.example.batsumisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener() {
            val intent = Intent(this, YourDashboard::class.java)
            startActivity(intent)
        }
    }
}