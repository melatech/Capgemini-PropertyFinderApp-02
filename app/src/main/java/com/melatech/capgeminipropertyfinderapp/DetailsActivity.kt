package com.melatech.capgeminipropertyfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailsActivity : AppCompatActivity() {
    lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        backButton = findViewById(R.id.backButton)

        backButton.setOnClickListener { finish() }
    }
}