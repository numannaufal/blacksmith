package com.example.blacksmith

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AppService: Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onDestroy() {
        AppSingleton.clearAppStatus(this)
    }
}