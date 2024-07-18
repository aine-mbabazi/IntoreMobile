package com.akirachix.mitushconnect

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mitushconnect.databinding.ConnectBinding


class ConnectAdapter (var connectList: List<CategoryData>): RecyclerView.Adapter<ConnectViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConnectViewHolder {
        val binding =
            ConnectBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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


class ConnectViewHolder(var binding: ConnectBinding) : RecyclerView.ViewHolder(binding.root)
