package com.project.bukuwurangassignment.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.project.bukuwurangassignment.di.ViewModelKey
import com.project.bukuwurangassignment.di.ViewModelProviderFactory
import com.project.bukuwurangassignment.viewModel.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelBinder {
    @Binds
    @Singleton
    abstract fun providesViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun providesHomeViewModel(homeViewModel: HomeViewModel): ViewModel
}