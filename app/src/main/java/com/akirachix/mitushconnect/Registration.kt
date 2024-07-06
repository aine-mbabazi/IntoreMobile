package com.akirachix.mitushconnect

import android.provider.ContactsContract.CommonDataKinds.Email

data class Registration(
    var fullName: String,
    var  email: String,
    var userName: String,
    var passWord:String,
    var confirmPassword: String,
    var phoneNumber: String
)
