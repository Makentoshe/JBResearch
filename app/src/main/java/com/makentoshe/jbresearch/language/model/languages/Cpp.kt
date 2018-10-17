package com.makentoshe.jbresearch.language.model.languages

import com.makentoshe.jbresearch.Languages
import com.makentoshe.jbresearch.R

class Cpp : Language {

    override val title: String
        get() = Languages.cpp

    override val description: Int
        get() = R.string.cpp_description
}