package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class firstsection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstsection)

        var imageView20 = findViewById<ImageView>(R.id.imageView20)
        imageView20.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        var imageView21 = findViewById<ImageView>(R.id.imageView21)
        imageView21.setOnClickListener {
            val intent = Intent(this, firstsection::class.java)
            startActivity(intent)
        }

        var imageView26 = findViewById<ImageView>(R.id.imageView26)
        imageView26.setOnClickListener {
            val intent = Intent(this, secondsection::class.java)
            startActivity(intent)
        }
    }
}