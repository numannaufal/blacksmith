package com.example.blacksmith

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val status = AppSingleton.getAppStatus(this)
        if (status == "started") {
            AppSingleton.clearAppStatus(this)
            finish()
        } else {
            goToActivity(SplashActivity::class.java)
        }
    }

    private fun goToActivity(activityClass: Class<SplashActivity>) {
        var intent = Intent(this, activityClass)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppSingleton.clearAppStatus(this)
    }
}