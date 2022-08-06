package com.example.blacksmith

import android.content.Context
import android.preference.PreferenceManager

private const val APP_STATUS = "status"

object AppSingleton {
    fun getAppStatus(context: Context): String {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        return prefs.getString(APP_STATUS, "")!!
    }

    fun setAppStatus(context: Context, status: String) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .putString(APP_STATUS, status)
            .apply()
    }

    fun clearAppStatus(context: Context) {
        PreferenceManager.getDefaultSharedPreferences(context)
            .edit()
            .remove(APP_STATUS)
            .commit()
    }
}