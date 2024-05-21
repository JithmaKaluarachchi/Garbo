package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageButton8 = findViewById<ImageButton>(R.id.imageButton8)
        imageButton8.setOnClickListener {
            val intent = Intent(this, UserOnbrardingScreen_1::class.java)
            startActivity(intent)
        }

    }



}