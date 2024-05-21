package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class secondsection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondsection)

        var imageView16 = findViewById<ImageView>(R.id.imageView16)
        imageView16.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        var imageView17 = findViewById<ImageView>(R.id.imageView17)
        imageView17.setOnClickListener {
            val intent = Intent(this, firstsection::class.java)
            startActivity(intent)
        }

        var imageView18 = findViewById<ImageView>(R.id.imageView18)
        imageView18.setOnClickListener {
            val intent = Intent(this, secondsection::class.java)
            startActivity(intent)
        }
    }
}