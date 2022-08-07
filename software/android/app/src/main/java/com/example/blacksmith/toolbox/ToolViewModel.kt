package com.example.blacksmith.toolbox

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToolViewModel(): ViewModel() {
    val toolLiveData = MutableLiveData<Tool>()

    fun loadData(title: String?, resourceImg: Int?) {
        toolLiveData.value = Tool(title, resourceImg)
    }
}