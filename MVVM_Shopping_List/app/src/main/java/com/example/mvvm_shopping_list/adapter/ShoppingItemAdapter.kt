package com.example.mvvm_shopping_list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_shopping_list.R
import com.example.mvvm_shopping_list.model.ShoppingItem
import com.example.mvvm_shopping_list.ui.ShoppingViewModel
import kotlinx.android.synthetic.main.shopping_item.view.*

class ShoppingItemAdapter(var items: List<ShoppingItem>, private var viewModel: ShoppingViewModel) :
    RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {

    inner class ShoppingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.shopping_item, parent, false)
        return ShoppingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        var currentShoppingItem = items[position]

        holder.itemView.tvName.text = currentShoppingItem.name
        holder.itemView.tvAmount.text = "${currentShoppingItem.amount}"

        holder.itemView.ivDelete.setOnClickListener {
            viewModel.delete(currentShoppingItem)
        }
        holder.itemView.ivPlus.setOnClickListener {
            currentShoppingItem.amount++
            viewModel.upsert(currentShoppingItem)
        }
        holder.itemView.ivMinus.setOnClickListener {
            if (currentShoppingItem.amount > 0) {
                currentShoppingItem.amount--
                viewModel.upsert(currentShoppingItem)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}