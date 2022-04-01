package com.melatech.capgeminipropertyfinderapp

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class DetailsActivity : AppCompatActivity() {
    lateinit var backButton: Button
    lateinit var titleTextView: TextView
    lateinit var descriptionTextView: TextView
    lateinit var bedsTextView: TextView
    lateinit var bathsTextView: TextView
    lateinit var yearsTextView: TextView
    lateinit var imageView: ImageView
    lateinit var card2ImageView: ImageView
    lateinit var card3ImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener { finish() }
        fetchData()

    }

    fun fetchData(){
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

        val images = extras.getIntegerArrayList("imageKey")
        imageView = findViewById(R.id.detailImageView)

        var index = 0
        imageView.setImageResource(images!![index])
        imageView.setOnClickListener {
            index++

            showNextImage(index, images)

        }
    }

    fun showNextImage(index: Int, imageArr: ArrayList<Int>){
        var mIndex = index
        if(mIndex == imageArr.size)
            mIndex = 0
        imageView.setImageResource(imageArr[mIndex])


    }




}