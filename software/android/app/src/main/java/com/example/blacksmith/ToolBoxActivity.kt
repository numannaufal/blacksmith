package com.example.blacksmith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.blacksmith.toolbox.Tool

class ToolBoxActivity : AppCompatActivity(), ToolFragment.Callbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildViews()
    }

    private fun buildViews() {
        setContentView(R.layout.activity_tool_box)
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        if (currentFragment == null) {
            val fragment = ToolFragment.newInstance("Concept")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onDataPassed(title: String) {
        Log.d("saibara:", title)
    }
}