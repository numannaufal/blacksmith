package com.example.blacksmith

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Intent(this, AppService::class.java).also { intent ->
            startService(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        open()
    }

    private fun open() {
        goToActivity(SplashActivity::class.java, "open")
    }

    private fun goToActivity(activityClass: Class<SplashActivity>, action: String) {
        val intent = Intent(this, activityClass).apply {
            putExtra("action", action)
        }
        startActivity(intent)
    }
}