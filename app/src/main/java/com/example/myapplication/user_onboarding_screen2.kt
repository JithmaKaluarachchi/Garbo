package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class user_onboarding_screen2 : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_onboarding_screen2)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, user_onboarding_screen3::class.java)
            startActivity(intent)
        }
    }

}