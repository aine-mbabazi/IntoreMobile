package com.akirachix.mitushconnect

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mitushconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            binding.Btn1.setOnClickListener {
                val intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)

            }

        }
    }
}

