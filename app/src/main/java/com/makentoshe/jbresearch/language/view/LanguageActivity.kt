package com.makentoshe.jbresearch.language.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.textView

class LanguageActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(frameLayout {
            textView(intent.getStringExtra(LANGUAGE))
        })
    }

    companion object {
        const val LANGUAGE = "Language"
    }

}