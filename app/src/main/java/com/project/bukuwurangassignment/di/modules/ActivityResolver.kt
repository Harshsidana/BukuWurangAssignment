package com.project.bukuwurangassignment.di.modules


import com.project.bukuwurangassignment.MainActivity
import com.project.bukuwurangassignment.home.di.HomeDi
import com.project.bukuwurangassignment.home.di.HomeModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityResolver {

    @ContributesAndroidInjector(modules = [HomeDi::class, HomeModule::class])
    abstract fun provideMainActivity(): MainActivity

}