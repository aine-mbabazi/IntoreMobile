package com.akirachix.mitushconnect

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mitushconnect.databinding.ActivityMainBinding
import com.akirachix.mitushconnect.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin2.setOnClickListener {
            val intent = Intent(this,LoginActivity ::class.java)
            startActivity(intent)
            binding.SignUpBtn.setOnClickListener {
                validateRegistration()
            }
        }
    }


fun validateRegistration(){
    clearError()
    var formError = false
    val FullName = binding.etFullName.text.toString()
    if(FullName.isBlank()){
        formError = true
        binding .etFullName.error = "firstName is required"
    }


    val UserName = binding.etUserName.text.toString()
    if(FullName.isBlank()){
        formError = true
        binding .etUserName.error = "userName is required"
    }

    val email = binding.etEmail.text.toString()
    if(email.isBlank()){
        formError = true
        binding .etEmail.error = "email is required"
    }

    val password = binding.etPassWord.text.toString()
    if(password.isBlank()){
        formError = true
        binding .etPassWord.error = "password is required"
    }

    val confirmPassword = binding.etConfirmPassword.text.toString()
    if(confirmPassword.isBlank()){
        formError = true
        binding .etConfirmPassword.error = "password is required"
    }

    val phoneNumber= binding.etPhoneNumber.text.toString()
    if(phoneNumber.isBlank()){
        formError = true
        binding .etPhoneNumber.error = "phoneNumber is required"
    }

    if(!formError){
    val registration = Registration(
        fullName = FullName,
        userName = UserName,
        email = email,
        passWord = password,
        confirmPassword = confirmPassword,
        phoneNumber =  phoneNumber,
    )
    }
}
    fun clearError(){
        binding.tilFullName.error = null
        binding.tilUserName.error = null
        binding .tilEmail.error = null
        binding.tilPassWord.error = null
        binding.tilconfirmPassword.error = null
        binding.tilPhoneNumber.error = null
    }
}
