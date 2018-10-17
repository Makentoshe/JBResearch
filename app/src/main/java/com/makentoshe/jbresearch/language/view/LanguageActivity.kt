package com.makentoshe.jbresearch.language.view

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.makentoshe.jbresearch.language.LanguageViewModel
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.textView

class LanguageActivity: AppCompatActivity() {

    private lateinit var viewModel: LanguageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val factory = LanguageViewModel.Factory(intent.getStringExtra(LANGUAGE))
        viewModel = ViewModelProviders.of(this, factory)[LanguageViewModel::class.java]
        super.onCreate(savedInstanceState)
        setContentView(frameLayout {
            textView(viewModel.language)
        })
    }

    companion object {
        const val LANGUAGE = "Language"
    }

}