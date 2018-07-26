package com.bigman.wmzx.customcardview.library

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import com.bigman.wmzx.cardviewlibrary.library.CardViewBaseImpl
import com.bigman.wmzx.cardviewlibrary.library.CardViewDelegate


/**
 * create by bigman
 * create date == 2018/7/10
 * create time == 15:48
 */
internal class CardViewApi17Impl : CardViewBaseImpl() {
    override fun initialize(cardView: CardViewDelegate, context: Context, backgroundColor: ColorStateList, radius: Float, elevation: Float, maxElevation: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = object : RoundRectDrawableWithShadow.RoundRectHelper {
            override fun drawRoundRect(canvas: Canvas, bounds: RectF, cornerRadius: Float, paint: Paint?) {
                canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint)
            }


        }

    }

}