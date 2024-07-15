package com.akirachix.mitushconnect

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akirachix.mitushconnect.databinding.ActivityPaymentBinding



class PaymentsAdapter(var paymentsList: List<Payments>): RecyclerView.Adapter<PaymentsViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentsViewHolder {
        val binding = ActivityPaymentBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PaymentsViewHolder(binding)
    }



    override fun onBindViewHolder(holder: PaymentsViewHolder, position: Int) {
        val blog =  paymentsList[position]
        holder.binding.tvView4.text = blog.name
        holder.binding.tvPrice.text = blog.price


//
//        Picasso
//            .get()
//            .load(blog.post)
//            .into(holder.binding.ivBlogPost)
//

    }

    override fun getItemCount(): Int {
        return paymentsList.size

    }
}
class PaymentsViewHolder(var binding:ActivityPaymentBinding ): RecyclerView.ViewHolder(binding.root) {


}