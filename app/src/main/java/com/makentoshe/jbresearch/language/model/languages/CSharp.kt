package com.makentoshe.jbresearch.language.model.languages

import com.makentoshe.jbresearch.Languages
import com.makentoshe.jbresearch.R

class CSharp : Language {

    override val title: String
        get() = Languages.csharp

    override val drawableRes: Int
        get() = TODO("not implemented")
    override val description: Int
        get() = R.string.csharp_description
}