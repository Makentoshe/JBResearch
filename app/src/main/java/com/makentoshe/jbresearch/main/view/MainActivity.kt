package com.makentoshe.jbresearch.main.view

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.makentoshe.jbresearch.Style
import com.makentoshe.jbresearch.main.MainViewModel
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    private val style = Style()
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]
        super.onCreate(savedInstanceState)
        MainActivityUI(style, viewModel).setContentView(this)
    }
}
