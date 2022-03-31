package com.melatech.capgeminipropertyfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    lateinit var backButton: Button
    lateinit var titleTextView: TextView
    lateinit var descriptionTextView: TextView
    lateinit var bedsTextView: TextView
    lateinit var bathsTextView: TextView
    lateinit var yearsTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener { finish() }

        val intent = intent
        val extras = intent.extras

        val title = extras!!.getString("titleKey")
        titleTextView = findViewById(R.id.titleTextView)
        titleTextView.text = title

        val description = extras.getString("descriptionKey")
        descriptionTextView = findViewById(R.id.descriptionTextView)
        descriptionTextView.text = description

        val beds = extras.getInt("bedsKey")
        bedsTextView = findViewById(R.id.bedroomTextView)
        bedsTextView.text = beds.toString()

        val baths = extras.getInt("bathsKey")
        bathsTextView = findViewById(R.id.bathroomsTextView)
        bathsTextView.text = baths.toString()

        val year = extras.getInt("yearsKey")
        yearsTextView = findViewById(R.id.yearTextView)
        yearsTextView.text = year.toString()

    }
}