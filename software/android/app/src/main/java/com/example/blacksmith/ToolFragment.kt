package com.example.blacksmith

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.blacksmith.toolbox.Tool
import com.example.blacksmith.toolbox.ToolViewModel
import java.util.*


private const val TOOL_FRAGMENT_TITLE = "title"
private const val TOOL_FRAGMENT_IMG = "img"


class ToolFragment : Fragment(R.layout.fragment_tool) {
    interface Callbacks {
        fun onNotified(title: String)
    }
    private var callbacks: Callbacks? = null

    private var title: String? = null
    private var imageResource: Int? = 0

    private val toolViewModel: ToolViewModel by lazy {
        ViewModelProvider(this).get(ToolViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = arguments?.getString(TOOL_FRAGMENT_TITLE)
        imageResource = arguments?.getInt(TOOL_FRAGMENT_IMG)
        toolViewModel.loadData(title, imageResource)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolViewModel.toolLiveData.observe(
            viewLifecycleOwner,
            Observer { tool ->
                tool?.let {
                    this.title = tool.title
                    this.imageResource = tool.imageResource
                    notifyUI()
                }
            }
        )
    }

    private fun notifyUI() {
        val view = getView()
        view?.let {
            buildViews(view, title, imageResource)
        }
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
        title = arguments?.getString(TOOL_FRAGMENT_TITLE)
        imageResource = arguments?.getInt(TOOL_FRAGMENT_IMG)
        buildViews(view, title, imageResource )
        return view
    }

    private fun buildViews(view: View, title: String?, img: Int?) {
        val text: TextView = view.findViewById(R.id.toolTextView)
        val image: ImageView = view.findViewById(R.id.toolImageView)
        text.setText(title)
        img?.let { img ->
            image.setBackgroundResource(img)
        }
    }

    override fun onStart() {
        super.onStart()
        callbacks?.onNotified("passing data from fragment")
        Handler(Looper.getMainLooper()).postDelayed({
            toolViewModel.loadData("SAIBARA BLACKSMITH MAN", R.mipmap.engineer_hat_foreground)
        }, 3000)
    }

    companion object {
        fun newInstance(title: String, imageResourceId: Int): ToolFragment {
            val args = Bundle().apply {
                putString(TOOL_FRAGMENT_TITLE, title)
                putInt(TOOL_FRAGMENT_IMG, imageResourceId)
            }
            return ToolFragment().apply {
                arguments = args;
            }
        }
    }
}