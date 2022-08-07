package com.example.blacksmith

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ToolBoxActivity : AppCompatActivity(), ToolFragment.Callbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buildViews()
    }

    private fun buildViews() {
        setContentView(R.layout.activity_tool_box)
        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        if (currentFragment == null) {
            refreshFragment("...")
        }
    }

    override fun onInit(title: String) {
        refreshFragment("Concept")
    }

    private fun refreshFragment(title: String) {
        val fragment = ToolFragment.newInstance(title)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .addToBackStack(null)
            .commit()
    }


}