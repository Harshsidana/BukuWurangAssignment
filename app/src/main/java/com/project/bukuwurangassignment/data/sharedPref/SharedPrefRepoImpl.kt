package com.project.bukuwurangassignment.data.sharedPref

class SharedPrefRepoImpl(private val sharedPrefs: SharedPrefs) :
    SharedPrefRepo {
    override fun setUserName(value: String) {
        sharedPrefs.userName=value
    }

    override fun getUserName(): String {
       return sharedPrefs.userName
    }

    override fun setEmail(value: String) {
        sharedPrefs.email=value
    }

    override fun getEmail(): String {
      return  sharedPrefs.email
    }

    override fun getPhoneNumber(): String {
      return  sharedPrefs.phone
    }

    override fun setPhoneNumber(value: String) {
        sharedPrefs.phone=value
    }


}