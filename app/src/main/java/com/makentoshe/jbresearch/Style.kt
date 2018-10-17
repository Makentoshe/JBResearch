package com.makentoshe.jbresearch

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat
import org.jetbrains.anko.dip

class Style {

    val toolbar = ToolbarStyle(R.color.colorPrimary, android.R.color.white)

}


open class ViewStyle(@JvmField @ColorRes val primaryColorRes: Int,
                     @JvmField @ColorRes val onPrimaryColorRes: Int) {

    fun getPrimaryColor(context: Context) = ContextCompat.getColor(context, primaryColorRes)

    fun getOnPrimaryColor(context: Context) = ContextCompat.getColor(context, onPrimaryColorRes)

}

class ToolbarStyle(primaryColorRes: Int, onPrimaryColorRes: Int) : ViewStyle(primaryColorRes, onPrimaryColorRes) {

    @JvmField
    val dpHeight = 56

    fun getHeightInPixel(context: Context) = context.dip(dpHeight)

}