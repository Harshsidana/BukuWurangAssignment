package com.project.bukuwurangassignment.home.di

import com.project.bukuwurangassignment.home.HomeFragment
import com.project.bukuwurangassignment.profile.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector
@Module
abstract class HomeModule {

    @ContributesAndroidInjector
   abstract fun homeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract  fun profileFragment(): ProfileFragment

}