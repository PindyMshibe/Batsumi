package com.example.batsumisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View
import android.view.ViewGroup


class YourDashboard : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_dashboard)

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener() {
            val intent = Intent(this, SplashActivityScreen::class.java)
            startActivity(intent)
        }

         val button3: Button = findViewById(R.id.button3)
         button3.setOnClickListener {
             val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)
         }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

        }

    }
}