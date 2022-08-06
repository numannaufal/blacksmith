package com.example.blacksmith

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val status = AppSingleton.getAppStatus(this)
        when (status) {
            "started" -> open()
            else -> close()
        }
    }

    private fun open() {
        AppSingleton.clearAppStatus(this)
        goToActivity(SplashActivity::class.java, "close")
    }

    private fun close() {
        goToActivity(SplashActivity::class.java, "open")
    }

    private fun goToActivity(activityClass: Class<SplashActivity>, action: String) {
        val intent = Intent(this, activityClass).apply {
            putExtra("action", action)
        }
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppSingleton.clearAppStatus(this)
    }
}