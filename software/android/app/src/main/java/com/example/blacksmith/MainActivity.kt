package com.example.blacksmith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textViewTitle: TextView

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
        textViewTitle = findViewById(R.id.textView)
        textViewTitle.setText(R.string.app_name)
    }

    private fun buildImage() {

    }
}