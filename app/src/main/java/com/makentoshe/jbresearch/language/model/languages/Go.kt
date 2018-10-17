package com.makentoshe.jbresearch.language.model.languages

import com.makentoshe.jbresearch.Languages
import com.makentoshe.jbresearch.R

class Go : Language {

    override val title: String
        get() = Languages.go

    override val drawableRes: Int
        get() = TODO("not implemented")
    override val description: Int
        get() = R.string.go_description
}