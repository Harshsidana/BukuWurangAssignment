package com.project.bukuwurangassignment.useCases

import com.project.bukuwurangassignment.data.sharedPref.SharedPrefRepo

class SharedPrefUseCase(private val repo: SharedPrefRepo) : UseCase() {

    fun setUsername(value: String) {
        repo.setUserName(value)
    }

    fun getUsername(): String {
        return repo.getUserName()
    }

    fun setEmail(value: String) {
        repo.setEmail(value)
    }

    fun getEmail(): String {
        return repo.getEmail()
    }

    fun setPhone(value: String) {
        repo.setPhoneNumber(value)
    }

    fun getPhone(): String {
        return repo.getPhoneNumber()
    }



}
