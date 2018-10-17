package com.makentoshe.jbresearch.main.view

import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.makentoshe.jbresearch.R
import com.makentoshe.jbresearch.Style
import com.makentoshe.jbresearch.main.MainViewModel
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.titleResource
import org.jetbrains.anko.appcompat.v7.toolbar

class MainActivityUI(private val style: Style, private val viewModel: MainViewModel) : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        verticalLayout {
            createToolbar(ui.owner)
            createContent()
        }
    }

    private fun _LinearLayout.createToolbar(owner: AppCompatActivity) {
        owner.setSupportActionBar(toolbar {
            setBackgroundResource(style.toolbar.primaryColorRes)
            titleResource = R.string.app_name
            setTitleTextColor(ContextCompat.getColor(context, style.toolbar.onPrimaryColorRes))
        })
    }

    private fun _LinearLayout.createContent() {
        listView {
            adapter = viewModel.getContentAdapter(context)
        }.lparams(width = matchParent, height = matchParent)
    }
}