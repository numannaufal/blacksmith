package com.example.blacksmith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textViewTitle: TextView
    private lateinit var imageViewMascot: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildViews();
    }

    private fun buildViews() {
        setContentView(R.layout.activity_main)
        buildTitle()
        buildImage()
    }

    private fun buildTitle() {
        textViewTitle = findViewById(R.id.title)
        textViewTitle.setText(R.string.app_name)
    }

    private fun buildImage() {
        imageViewMascot = findViewById(R.id.mascot)
        imageViewMascot.visibility = View.VISIBLE
    }
}