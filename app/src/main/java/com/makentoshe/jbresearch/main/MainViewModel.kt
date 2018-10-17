package com.makentoshe.jbresearch.main

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.makentoshe.jbresearch.R
import com.makentoshe.jbresearch.main.model.Navigator

class MainViewModel(private val navigator: Navigator) : ViewModel() {

    fun getContentAdapter(context: Context): ArrayAdapter<out CharSequence> {
        return ArrayAdapter.createFromResource(context, R.array.languages, android.R.layout.simple_list_item_1)
    }

    fun startLanguageActivity(activity: AppCompatActivity, item: String) {
        navigator.startLanguageActivity(activity, item)
    }

    class Factory(private val navigator: Navigator = Navigator()): ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass == MainViewModel::class.java) {
                return MainViewModel(navigator) as T
            }
            return super.create(modelClass)
        }
    }

}