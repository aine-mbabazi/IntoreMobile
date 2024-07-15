package com.akirachix.mitushconnect

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mitushconnect.databinding.ActivityLoginBinding
import com.akirachix.mitushconnect.databinding.CategoryBinding
import com.akirachix.mitushconnect.databinding.NegotiationRecyclerBinding
import com.akirachix.mitushconnect.databinding.NegotiationsBinding

class NegotiationActivity: AppCompatActivity()  {
    lateinit var binding: NegotiationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NegotiationActivity.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LoginBtn.setOnClickListener {
            val intent = Intent(this,CategoryActivity::class.java)
            startActivity(intent)

        }

        binding.tvLSignup.setOnClickListener {
            val intent = Intent(this,SignUpActivity ::class.java)
            startActivity(intent)
        }
        validateRegistration()
    }

    }
}
