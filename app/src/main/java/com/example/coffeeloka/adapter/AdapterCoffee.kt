package com.example.coffeeloka.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coffeeloka.R
import com.example.coffeeloka.databinding.ListCoffeeBinding
import com.example.coffeeloka.model.Coffee
import com.google.android.material.snackbar.Snackbar
import com.like.LikeButton
import com.like.OnLikeListener


class AdapterCoffee(private var list : ArrayList<Coffee>, private val context: Context) : RecyclerView.Adapter<AdapterCoffee.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    class ListViewHolder(val binding: ListCoffeeBinding) : RecyclerView.ViewHolder(binding.root)

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val layoutInflater =
            ListCoffeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding.txtTitleCoffeeList.text = list[position].titleCoffee
        holder.binding.txtAddressCoffeeList.text = list[position].addressCoffee
        holder.binding.txtAddressCoffeeList.text = list[position].addressCoffee
        holder.binding.txtRateList.text = list[position].rateCoffee.toString()

        Glide.with(holder.binding.root)
            .load(list[position].imageCoffe)
            .into(holder.binding.imgCoffeeList)

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(list[holder.adapterPosition])
        }


    }

    fun filterList(filteredList : ArrayList<Coffee>){
        list = filteredList
        notifyDataSetChanged()
    }

    interface OnItemClickCallback {
        fun onItemClicked(coffee: Coffee)
    }


}






