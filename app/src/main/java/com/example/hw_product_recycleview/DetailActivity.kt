package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        // now will move to another activity and get our data

        val actionBar : ActionBar? = supportActionBar

        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

        // also set in manifest file ,that which activity to move our another activity

        // noe get data from putExtra intent

        var intent = intent

        val dTitle = intent.getStringExtra("iTitle")
        val dPrice = intent.getStringExtra("iPrice")
        val dImage = intent.getIntExtra("iImageView",0)

        // set title in another activity

        actionBar.setTitle("Detail Of Phone")
        d_title.text = dTitle
        d_price.text = dPrice
        imageView.setImageResource(dImage)


    }
}