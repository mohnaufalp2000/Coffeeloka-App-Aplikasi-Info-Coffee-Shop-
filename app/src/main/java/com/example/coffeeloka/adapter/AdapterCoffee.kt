package com.example.coffeeloka.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coffeeloka.databinding.ListCoffeeBinding
import com.example.coffeeloka.model.Coffee
import com.example.coffeeloka.view.DetailActivity

class AdapterCoffee(private var list : ArrayList<Coffee>) : RecyclerView.Adapter<AdapterCoffee.ListViewHolder>() {

    class ListViewHolder(val binding: ListCoffeeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val layoutInflater =
            ListCoffeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding.txtTitleCoffeeList.text = list[position].titleCoffee
        holder.binding.txtAddressCoffeeList.text = list[position].addressCoffee

        Glide.with(holder.binding.root)
            .load(list[position].imageCoffe)
            .into(holder.binding.imgCoffeeList)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.apply {
                putExtra(DetailActivity.TITLE, list[position].titleCoffee)
                putExtra(DetailActivity.ADDRESS, list[position].addressCoffee)
                putExtra(DetailActivity.DETAIL, list[position].detailCoffee)
                putExtra(DetailActivity.HOURS, list[position].hoursCoffee)
                putExtra(DetailActivity.PRICE, list[position].priceCoffee)
                putExtra(DetailActivity.RATE, list[position].rateCoffee)
                putExtra(DetailActivity.IMAGE, list[position].imageCoffe)
            }
            holder.itemView.context.startActivity(intent)
        }

    }

    fun filterList(filteredList : ArrayList<Coffee>){
        list = filteredList
        notifyDataSetChanged()
    }

}






