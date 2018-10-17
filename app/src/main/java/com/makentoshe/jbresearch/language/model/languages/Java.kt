package com.makentoshe.jbresearch.language.model.languages

import com.makentoshe.jbresearch.Languages
import com.makentoshe.jbresearch.R

class Java : Language {

    override val title: String
        get() = Languages.java

    override val drawableRes: Int
        get() = TODO("not implemented")
    override val description: Int
        get() = R.string.java_description
}