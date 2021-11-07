package com.example.hw_product_recycleview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes



open class Product (@StringRes val stringResourceId: Int,
                    @DrawableRes val imageResourceId: Int,
                    @StringRes val priceResourceId : Int)
