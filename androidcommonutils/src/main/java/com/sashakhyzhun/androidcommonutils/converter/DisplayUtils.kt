package com.sashakhyzhun.androidcommonutils.converter

import android.content.res.Resources

/**
 * @author SashaKhyzhun
 * Created on 3/2/19.
 */



/**
 * Converts value to dp analog according to phones density
 */
val Int.dp: Int
    get() = (this / Resources.getSystem().displayMetrics.density).toInt()

/**
 * Converts value to px analog according to phones density
 */
val Int.px: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()

/**
 * Converts value to dp analog according to phones density
 */
val Float.dp: Float
    get() = this / Resources.getSystem().displayMetrics.density

/**
 * Converts value to px analog according to phones density
 */
val Float.px: Float
    get() = this * Resources.getSystem().displayMetrics.density

