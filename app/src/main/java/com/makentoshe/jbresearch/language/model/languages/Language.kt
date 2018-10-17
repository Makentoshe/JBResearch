package com.makentoshe.jbresearch.language.model.languages

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import com.makentoshe.jbresearch.Languages
import java.lang.IllegalArgumentException

interface Language {

    val title: String

    @get:StringRes
    val description: Int

    companion object {

        fun build(title: String): Language {
            return when (title) {
                Languages.kotlin -> Kotlin()
                Languages.cpp -> Cpp()
                Languages.java -> Java()
                Languages.go -> Go()
                Languages.csharp -> CSharp()
                else -> throw IllegalArgumentException()
            }
        }

    }

}

