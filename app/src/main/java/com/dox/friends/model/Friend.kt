package com.dox.friends.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Friend(@StringRes val stingResourceId: Int, @DrawableRes val imageResourceId: Int)
