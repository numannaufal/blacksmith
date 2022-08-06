package com.example.blacksmith

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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
        buildStatus()
        buildImage()
    }

    private fun buildStatus() {
        textViewTitle = findViewById(R.id.status)
        textViewTitle.setText(R.string.loading)
    }

    private fun buildImage() {
        imageViewMascot = findViewById(R.id.mascot)
        imageViewMascot.visibility = View.VISIBLE
    }

    override fun onStart() {
        super.onStart()
        Handler().postDelayed({
            goToActivity(HomeActivity::class.java)
        }, 3000)
    }

    private fun goToActivity(activityClass: Class<HomeActivity>) {
        var intent = Intent(this, activityClass)
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent)
        finish()
    }
}