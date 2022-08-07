package com.example.blacksmith

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.blacksmith.toolbox.Tool
import java.util.*


private const val TOOL_FRAGMENT_TITLE = "title"


class ToolFragment : Fragment(R.layout.fragment_tool) {
    interface Callbacks {
        fun onInit(title: String)
    }
    private var callbacks: Callbacks? = null

    private var title: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = arguments?.getString(TOOL_FRAGMENT_TITLE)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks = context as Callbacks?
    }

    override fun onDetach() {
        super.onDetach()
        callbacks = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tool, container, false)
        val text: TextView = view.findViewById(R.id.toolTextView)
        val image: ImageView = view.findViewById(R.id.toolImageView)
        title = arguments?.getString(TOOL_FRAGMENT_TITLE)
        text.setText(title)
        image.setBackgroundResource(R.mipmap.engineer_hat_foreground)
        return view
    }

    override fun onStart() {
        super.onStart()
        if (title == null) {
            callbacks?.onInit("hello from fragment")
        }
    }

    companion object {
        fun newInstance(title: String): ToolFragment {
            val args = Bundle().apply {
                putString(TOOL_FRAGMENT_TITLE, title)
            }
            return ToolFragment().apply {
                arguments = args;
            }
        }
    }
}