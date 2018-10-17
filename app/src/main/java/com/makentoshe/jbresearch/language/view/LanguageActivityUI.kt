package com.makentoshe.jbresearch.language.view

import android.support.v7.app.AppCompatActivity
import android.view.View
import com.makentoshe.jbresearch.Style
import com.makentoshe.jbresearch.language.LanguageViewModel
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko._LinearLayout
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.verticalLayout

class LanguageActivityUI(private val style: Style, private val viewModel: LanguageViewModel)
    : AnkoComponent<LanguageActivity> {

    override fun createView(ui: AnkoContext<LanguageActivity>): View = with(ui) {
        verticalLayout {
            createToolbar(ui.owner)
        }
    }

    private fun _LinearLayout.createToolbar(owner: AppCompatActivity) {
        owner.setSupportActionBar(toolbar {
            title = viewModel.language.title
            setTitleTextColor(style.toolbar.getOnPrimaryColor(context))
            setBackgroundResource(style.toolbar.primaryColorRes)
        })
    }
}