package com.example.blacksmith

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var textViewTitle: TextView
    private lateinit var imageViewMascot: ImageView
    private lateinit var buttonUpgrade: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildViews();
    }

    private fun buildViews() {
        setContentView(R.layout.activity_home)
        buildTitle()
        buildImage()
        buildButton()
    }

    private fun buildTitle() {
        textViewTitle = findViewById(R.id.title)
        textViewTitle.setText(R.string.app_name)
    }

    private fun buildImage() {
        imageViewMascot = findViewById(R.id.mascot)
        imageViewMascot.visibility = View.VISIBLE
    }

    private fun buildButton() {
        buttonUpgrade = findViewById(R.id.button)
        buttonUpgrade.setText(R.string.upgrade)
        buttonUpgrade.setOnClickListener {
            goToActivity(ToolBoxActivity::class.java)
        }
    }

    private fun goToActivity(activityClass: Class<ToolBoxActivity>) {
        var intent = Intent(this, activityClass)
        startActivity(intent)
    }
}