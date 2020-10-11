package com.project.bukuwurangassignment.home.di

import androidx.lifecycle.ViewModelProvider
import com.project.bukuwurangassignment.MainActivity
import com.project.bukuwurangassignment.viewModel.HomeViewModel
import dagger.Module
import dagger.Provides

@Module
class HomeDi{

    @Provides
    fun providesHomeViewModel(
        activity: MainActivity,
        factory: ViewModelProvider.Factory
    ): HomeViewModel {
        return ViewModelProvider(activity, factory).get(HomeViewModel::class.java)
    }
}