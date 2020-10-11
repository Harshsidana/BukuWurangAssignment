package com.project.bukuwurangassignment.viewModel

import com.project.bukuwurangassignment.Application
import com.project.bukuwurangassignment.base.BaseNetworkViewModel
import com.project.bukuwurangassignment.useCases.FetchUserDataUseCase
import javax.inject.Inject


class HomeViewModel@Inject constructor(
    application: Application,
    private val fetchUserDataUseCase: FetchUserDataUseCase
) : BaseNetworkViewModel(application,fetchUserDataUseCase) {

    fun getUsers() =
        fetchUserDataUseCase.setup("").getResultLiveData()

}