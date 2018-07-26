package com.bigman.wmzx.customcardview.library

import android.content.Context
import android.content.res.ColorStateList
import com.bigman.wmzx.cardviewlibrary.library.CardViewDelegate


internal interface CardViewImpl {
    fun initialize(cardView: CardViewDelegate, context: Context, backgroundColor: ColorStateList,
                   radius: Float, elevation: Float, maxElevation: Float)

    fun setRadius(cardView: CardViewDelegate, radius: Float)

    fun getRadius(cardView: CardViewDelegate): Float

    fun setElevation(cardView: CardViewDelegate, elevation: Float)

    fun getElevation(cardView: CardViewDelegate): Float

    fun initStatic()

    fun setMaxElevation(cardView: CardViewDelegate, maxElevation: Float)

    fun getMaxElevation(cardView: CardViewDelegate): Float

    fun getMinWidth(cardView: CardViewDelegate): Float

    fun getMinHeight(cardView: CardViewDelegate): Float

    fun updatePadding(cardView: CardViewDelegate)

    fun onCompatPaddingChanged(cardView: CardViewDelegate)

    fun onPreventCornerOverlapChanged(cardView: CardViewDelegate)

    fun setBackgroundColor(cardView: CardViewDelegate, color: ColorStateList?)

    fun getBackgroundColor(cardView: CardViewDelegate): ColorStateList

    fun initialize(cardViewDelegate: CardViewDelegate, context: Context,
                   backgroundColor: ColorStateList, radius: Float, elevation: Float, maxElevation: Float, startColor: Int, endColor: Int)
}
