package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var textView14 = findViewById<TextView>(R.id.textView14)
        textView14.setOnClickListener {
            val intent = Intent(this, firstsection::class.java)
            startActivity(intent)
        }

        var textView15 = findViewById<TextView>(R.id.textView15)
        textView15.setOnClickListener {
            val intent = Intent(this, secondsection::class.java)
            startActivity(intent)
        }
    }
}