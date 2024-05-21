package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class user_onboarding_sc4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_onboarding_sc4)

        var button44 = findViewById<Button>(R.id.button44)
        button44.setOnClickListener {
            val intent = Intent(this, user_onboarding_screen5::class.java)
            startActivity(intent)
        }
    }
}