package com.example.hw_product_recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.DetailActivity
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

class ItemAdapter (private val context: Context,
                   private val dataset: List<Product> ) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    // to represents a single list item view in RecyclerView and reused it.
    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val phoneName: TextView = view.findViewById(R.id.item_title)
        val phoneImage: ImageView = view.findViewById(R.id.item_image)
        val textPrice: TextView = view.findViewById(R.id.item_price)

    }

    // method is called by the layout manager to create new view holders for the RecyclerView.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ItemViewHolder {
        // Here create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemAdapter.ItemViewHolder(adapterLayout)
    }
    //metho d called by the layout manager in order to replace the contents of a list item view.
    override fun onBindViewHolder(holder: ItemAdapter.ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.apply {
            phoneImage.setImageResource(item.phoneImage)
            phoneName.text = context.getText(item.phoneName)
            textPrice.text = context.getText(item.textPrice)


        }

        holder.itemView.setOnClickListener {

            // if (position == 0){

            //  Toast.makeText(context,"You clicked on Iphone 12 64GB",Toast.LENGTH_SHORT).show()
            //  }

            // get posi tion of selected item
            val model = dataset.get(position)
            // here i get text of selected item with intent
            var gTitle: String = model.phoneName.toString()
            var gPrice: Int = model.textPrice

            // get image with intent , which position is selected
            var gImageView: Int = model.phoneImage // coz image is int in product class

            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            // now put all item with putExtra intent

            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iPrice", gPrice)
            intent.putExtra("iImageView", gImageView)

            // to another activity


            context.startActivities(arrayOf(intent))


        }






    }

    // method needs to return the size of your dataset\list.
    override fun getItemCount(): Int = dataset.size


}