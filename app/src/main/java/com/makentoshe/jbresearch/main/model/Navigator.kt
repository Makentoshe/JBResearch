package com.makentoshe.jbresearch.main.model

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.makentoshe.jbresearch.language.view.LanguageActivity

class Navigator {

    fun startLanguageActivity(activity: AppCompatActivity, item: String) {
        val intent = Intent(activity, LanguageActivity::class.java)
        intent.putExtra(LanguageActivity.LANGUAGE, item)
        activity.startActivity(intent)
    }

}