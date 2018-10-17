package com.makentoshe.jbresearch

object Languages {
    const val go = "Go"
    const val cpp = "C++"
    const val java = "Java"
    const val csharp = "C#"
    const val kotlin = "Kotlin"

    fun toArray(): Array<String> {
        return arrayOf(kotlin, java, cpp, go, csharp)
    }
}