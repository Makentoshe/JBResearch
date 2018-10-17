package com.makentoshe.jbresearch.language

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.makentoshe.jbresearch.language.model.languages.Language

class LanguageViewModel(@JvmField val language: Language) : ViewModel() {



    class Factory(private val language: String) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass == LanguageViewModel::class.java) {
                return LanguageViewModel(Language.build(language)) as T
            }
            return super.create(modelClass)
        }
    }

}