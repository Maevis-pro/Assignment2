package com.example.assignment1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.Doll2)
        val TextView = findViewById<TextView>(R.id.Seemore2)
        val textView = findViewById<TextView>(R.id.Seemore)

        textView.setOnClickListener {
            Toast.makeText(this, "gone", Toast.LENGTH_LONG).show()
            imageView.visibility = View.VISIBLE
            TextView.visibility = View.VISIBLE
        }




    }
}