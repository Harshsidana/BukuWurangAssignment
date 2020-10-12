package com.project.bukuwurangassignment.data.sharedPref



interface SharedPrefRepo {
    fun setUserName(value: String)
    fun getUserName(): String
    fun setEmail(value: String)
    fun getEmail(): String
    fun getPhoneNumber(): String
    fun setPhoneNumber(value: String)
}