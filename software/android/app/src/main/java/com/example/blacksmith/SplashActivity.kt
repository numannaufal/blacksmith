package com.example.blacksmith

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    private lateinit var textViewTitle: TextView
    private lateinit var imageViewMascot: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildViews()
    }

    private fun buildViews() {
        setContentView(R.layout.activity_splash)
        buildImage()
    }

    private fun buildStatus(stringResourceId: Int) {
        textViewTitle = findViewById(R.id.status)
        textViewTitle.setText(stringResourceId)
    }

    private fun buildImage() {
        imageViewMascot = findViewById(R.id.mascot)
        imageViewMascot.visibility = View.VISIBLE
    }

    override fun onStart() {
        super.onStart()
        val action: String = intent.getStringExtra("action").toString()
        when (action) {
            "open" -> opening()
            else -> closing()
        }

    }

    private fun opening() {
        buildStatus(R.string.opening)
        Handler().postDelayed({
            intent.removeExtra("action")
            goToActivity(HomeActivity::class.java)
        }, 3000)
    }

    private fun closing() {
        buildStatus(R.string.closing)
        Handler().postDelayed({
            finishAffinity()
        }, 3000)
    }

    private fun goToActivity(activityClass: Class<HomeActivity>) {
        var intent = Intent(this, activityClass)
        startActivity(intent)
    }
}