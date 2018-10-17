package com.makentoshe.jbresearch.language

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class LanguageViewModel(@JvmField val language: String) : ViewModel() {

    class Factory(private val language: String) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass == LanguageViewModel::class.java) {
                return LanguageViewModel(language) as T
            }
            return super.create(modelClass)
        }
    }

}