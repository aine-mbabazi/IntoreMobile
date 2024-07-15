package com.akirachix.mitushconnect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mitushconnect.databinding.ActivityLoginBinding
import com.akirachix.mitushconnect.databinding.CategoryBinding
import com.akirachix.mitushconnect.databinding.CategoryListBinding

class CategoryActivity : AppCompatActivity() {
        lateinit var binding: CategoryBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = CategoryBinding.inflate(layoutInflater)

            setContentView(binding.root)

            binding.BtnBuy.setOnClickListener {
                val intent = Intent(this,PaymentsActivity::class.java)
                startActivity(intent)

            }

            binding.btnNegotitate.setOnClickListener {
                val intent = Intent(this,NegotiationActivity ::class.java)
                startActivity(intent)
            }

        }





        fun displayBlogs() {
            val connect1 = CategoryData("","A bale of denim jeans","15,000")
            val connect2 = CategoryData("https://cdn-hojkl.nitrocdn.com/SUQmYnwonRxVCIAAlcsDTbRgjHOQtWTB/assets/images/optimized/rev-ef6dd32/www.zagumi.com/wp-content/uploads/2023/02/Second-Hand-Jeans-Supplier-In-Europe.jpeg","A bale of cotton","10,000")
            val connect3 = CategoryData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhLZZgyrAxlGdgg9QhSIGZofO7vN1PEvPup0tBY6MdCOwy1HuShEc2MUckAgw7YY9NgfQ&usqp=CAU","A bale lenin","20,000")
            val connect4 = CategoryData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQsCKAjEMqFLO6FTq5QTaMfKePHwL9Duz9Hpl7Vco9gxmvgX3NPd1gSURxiIliFnVl2DU&usqp=CAU","A bale of fleece","10,000")
            val connect5= CategoryData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQw3l7FWF_v7O63pUQGDvGYfOmvRQRMTvpYrjzOPEm3-hylbza1a6U58Lw8b1uckOpiZoo&usqp=CAU","A bale of silk","7,000")

            var bales = listOf(connect1,connect2, connect3, connect4, connect5)

            val baleAdapter = ConnectAdapter(bales)
            binding.rvConnect.adapter = baleAdapter
        }
}





