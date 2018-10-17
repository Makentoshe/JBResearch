package com.makentoshe.jbresearch.main

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.widget.ArrayAdapter
import com.makentoshe.jbresearch.R

class MainViewModel: ViewModel() {

    fun getContentAdapter(context: Context): ArrayAdapter<out CharSequence> {
        return ArrayAdapter.createFromResource(context, R.array.languages, android.R.layout.simple_list_item_1)
    }

}