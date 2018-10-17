package com.makentoshe.jbresearch.language.view

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.makentoshe.jbresearch.Style
import com.makentoshe.jbresearch.forLollipop
import com.makentoshe.jbresearch.language.LanguageViewModel
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar

class LanguageActivityUI(private val style: Style, private val viewModel: LanguageViewModel)
    : AnkoComponent<LanguageActivity> {

    override fun createView(ui: AnkoContext<LanguageActivity>): View = with(ui) {
        verticalLayout {
            createToolbar(ui.owner)
            createContent()
        }
    }

    @SuppressLint("NewApi")
    private fun _LinearLayout.createToolbar(owner: AppCompatActivity) {
        owner.setSupportActionBar(toolbar {
            title = viewModel.language.title
            setTitleTextColor(style.toolbar.getOnPrimaryColor(context))
            setBackgroundResource(style.toolbar.primaryColorRes)
            forLollipop { elevation = dip(8).toFloat() }
        })
    }

    private fun _LinearLayout.createContent() {
        linearLayout {

            textView {
//                setCompoundDrawables()
                text = context.getString(viewModel.language.description)
            }

        }.lparams{
            setMargins(dip(16), dip(10), dip(16), 0)
        }
    }
}