package com.project.bukuwurangassignment.home.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.bukuwurangassignment.data.repository.UsersRepository
import com.project.bukuwurangassignment.viewModel.HomeViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeModelfactory @Inject constructor(private val usersRepository: UsersRepository) : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(usersRepository) as T

    }

}