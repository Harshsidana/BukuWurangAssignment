package com.project.bukuwurangassignment.viewModel

import com.project.bukuwurangassignment.Application
import com.project.bukuwurangassignment.base.BaseNetworkViewModel
import com.project.bukuwurangassignment.useCases.FetchUserDataUseCase
import com.project.bukuwurangassignment.useCases.SharedPrefUseCase
import javax.inject.Inject


class HomeViewModel@Inject constructor(
    application: Application,
    private val fetchUserDataUseCase: FetchUserDataUseCase,
    private val sharedPrefUseCase: SharedPrefUseCase
) : BaseNetworkViewModel(application,fetchUserDataUseCase) {

    fun getUsers() =
        fetchUserDataUseCase.setup("").getResultLiveData()

    fun getUserName()=sharedPrefUseCase.getUsername()
    fun getEmail()=sharedPrefUseCase.getEmail()
    fun getPhone()=sharedPrefUseCase.getPhone()

    fun setUserName(value:String)
    {
        sharedPrefUseCase.setUsername(value)
    }
    fun setEmail(value:String)
    {
        sharedPrefUseCase.setEmail(value)
    }
    fun setPhone(value:String)
    {
        sharedPrefUseCase.setPhone(value)
    }

}