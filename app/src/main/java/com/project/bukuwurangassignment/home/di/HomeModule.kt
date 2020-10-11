package com.project.bukuwurangassignment.home.di

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.project.bukuwurangassignment.MainActivity
import com.project.bukuwurangassignment.data.repository.UsersRepository
import com.project.bukuwurangassignment.home.factories.HomeModelfactory
import com.project.bukuwurangassignment.viewModel.HomeViewModel
import dagger.Module
import dagger.Provides

@Module
class HomeModule{
    @Provides
    fun provideSearchViewModelFactory(usersRepository : UsersRepository) = HomeModelfactory(usersRepository)
    @Provides
    fun provideImageSearchViewModel(factory : HomeModelfactory, activity : MainActivity) = ViewModelProviders
        .of(activity as AppCompatActivity, factory)
        .get(HomeViewModel::class.java)

}