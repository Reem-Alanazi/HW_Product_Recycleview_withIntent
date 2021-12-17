package com.example.hw_product_recycleview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


open class Product (@StringRes val phoneName: Int,
                    @DrawableRes val phoneImage: Int,
                    @StringRes val textPrice : Int,
                    val isVip: Boolean,
                    @StringRes val phoneQuantity : Int)