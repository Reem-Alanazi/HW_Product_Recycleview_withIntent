package com.example.hw_product_recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

class ItemAdapter (private val context: Context,
                   private val dataset: List<Product> ) :
           RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    // to represents a single list item view in RecyclerView and reused it.
    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textPrice: TextView = view.findViewById(R.id.item_price)

    }

      // method is called by the layout manager to create new view holders for the RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        // Here create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemAdapter.ItemViewHolder(adapterLayout)
    }
        //method called by the layout manager in order to replace the contents of a list item view.
    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
            val item = dataset[position]
            holder.textView.text = context.resources.getString(item.stringResourceId)
            holder.imageView.setImageResource(item.imageResourceId)
            holder.textPrice.text = context.resources.getString(item.priceResourceId)
    }

      // method needs to return the size of your dataset\list.
    override fun getItemCount(): Int = dataset.size


}