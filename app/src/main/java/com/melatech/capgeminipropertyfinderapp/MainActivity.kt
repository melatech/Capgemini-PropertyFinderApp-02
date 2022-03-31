package com.melatech.capgeminipropertyfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() , View.OnClickListener{
    lateinit var card1: LinearLayout
    lateinit var card2: LinearLayout
    lateinit var card3: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        card1 = findViewById(R.id.card_1)
        card2 = findViewById(R.id.card_2)
        card3 = findViewById(R.id.card_3)

        card1.setOnClickListener(this)
        card2.setOnClickListener(this)
        card3.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, DetailsActivity::class.java)

        startActivity(intent)
    }
}