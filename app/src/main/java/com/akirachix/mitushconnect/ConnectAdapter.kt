package com.akirachix.mitushconnect

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mitushconnect.databinding.CategoryListBinding

class ConnectAdapter (var connectList: List<CategoryData>): RecyclerView.Adapter<ConnectViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConnectViewHolder {
        val binding =
            CategoryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConnectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConnectViewHolder, position: Int) {
        val connect = connectList[position]
        holder.binding.tvDescription.text = connect.baleDescription
        holder.binding.tvAmount.text = connect.amount


    }

    override fun getItemCount(): Int {
        return connectList.size


    }
}


class ConnectViewHolder(var binding: CategoryListBinding) : RecyclerView.ViewHolder(binding.root)
