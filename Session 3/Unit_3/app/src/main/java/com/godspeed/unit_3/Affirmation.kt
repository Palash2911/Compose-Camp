package com.godspeed.unit_3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
     val stringResourceId: String,
    @DrawableRes val imageResourceId: Int
)
