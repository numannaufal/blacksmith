package com.example.blacksmith

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.blacksmith.toolbox.Tool


class ToolBoxActivity : AppCompatActivity(), ToolFragment.Callbacks {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_box)
        buildViews()
    }

    private fun buildViews() {
        refreshFragment("INITIAL")
    }

    private fun refreshFragment(title: String) {
        val fragmentManager: FragmentManager = supportFragmentManager;
        fragmentManager
            .beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragment_container_view,  ToolFragment.newInstance(title))
            .commit()
    }

    override fun onNotified(title: String) {
        // data from fragment $title
    }

}