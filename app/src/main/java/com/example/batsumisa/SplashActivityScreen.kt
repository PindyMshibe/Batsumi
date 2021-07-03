package com.example.batsumisa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val EXTRA_MESSAGE = "com.example.BatsumiSA.MESSAGE"
class SplashActivityScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, YourDashboard::class.java)
            startActivity(intent)
        }
    }
}