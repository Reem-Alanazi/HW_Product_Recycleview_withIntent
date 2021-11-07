package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

class Datasource {

    fun loadProduct(): List<Product> {
        return listOf<Product>(
            Product(R.string.price1,R.drawable.product1,R.string.price1),
            Product(R.string.price2,R.drawable.product2,R.string.price2),
            Product(R.string.price3,R.drawable.product3,R.string.price3),
            Product(R.string.price4,R.drawable.product4,R.string.price4),
            Product(R.string.price5,R.drawable.product5,R.string.price5),
            Product(R.string.price6,R.drawable.product6,R.string.price6),

        )
    }
}

