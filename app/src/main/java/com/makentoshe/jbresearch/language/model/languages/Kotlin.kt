package com.makentoshe.jbresearch.language.model.languages

import com.makentoshe.jbresearch.Languages
import com.makentoshe.jbresearch.R

class Kotlin : Language {

    override val title: String
        get() = Languages.kotlin

    override val description: Int
        get() = R.string.kotlin_description
}