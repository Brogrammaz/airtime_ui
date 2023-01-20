package com.example.airtime.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.airtime.HomeFragmentDirections
import com.example.airtime.R
import com.example.airtime.databinding.ProductViewBinding
import com.example.airtime.data.DataSource

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private val products = DataSource.products

    class HomeViewHolder(val view: ProductViewBinding): RecyclerView.ViewHolder(view.root){
        val productImage = view.productImage
        val productName = view.productName
        val productPrice = view.productPrice
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val adapterLayout = ProductViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val product = products[position]
        holder.productImage.setImageResource(product.imageResourceId)
        holder.productName.text = product.name
        holder.productPrice.text = holder.view.root.context.resources.getString(R.string.product_price, product.price)
        holder.productImage.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToItemFragment()
            holder.itemView.findNavController().navigate(action)
        }

    }

    override fun getItemCount(): Int = products.size

}