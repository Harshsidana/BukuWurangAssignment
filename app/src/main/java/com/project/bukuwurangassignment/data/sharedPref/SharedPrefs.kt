package com.project.bukuwurangassignment.data.sharedPref

import android.content.Context
import android.content.Context.MODE_PRIVATE

const val sharedPref = "sharedPref"

class SharedPrefs(context: Context) {
    private val sharedPreferences by lazy {
        context.getSharedPreferences(sharedPref, MODE_PRIVATE)
    }

    var userName: String
        get() = sharedPreferences.getString("userName", "") ?: ""
        set(value) = sharedPreferences.edit().putString("userName", value).apply()

    var email: String
        get() = sharedPreferences.getString("email", "") ?: ""
        set(value) = sharedPreferences.edit().putString("email", value).apply()

    var phone: String
        get() = sharedPreferences.getString("phone", "") ?: ""
        set(value) = sharedPreferences.edit().putString("phone", value).apply()


}