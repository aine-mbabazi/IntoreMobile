package com.akirachix.mitushconnect

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mitushconnect.databinding.ActivityLoginBinding
import com.akirachix.mitushconnect.databinding.ActivitySignUpBinding


class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLSignup.setOnClickListener {
            val intent = Intent(this,CategoryActivity ::class.java)
            startActivity(intent)
            binding.LoginBtn.setOnClickListener {
                validateRegistration()
            }
        }
    }


    fun validateRegistration(){
        clearError()
        var formError = false

        val UserName = binding.etUserName.text.toString()
        if(UserName.isBlank()){
            formError = true
            binding .etUserName.error = "userName is required"
        }


        val PassWord = binding.etpassword.text.toString()
        if(PassWord.isBlank()){
            formError = true
            binding .etpassword.error = "password is required"
        }



    }
    fun clearError(){
        binding.tilUserName.error = null
        binding.tilPassWord.error = null
    }
}
