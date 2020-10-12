package com.project.bukuwurangassignment.di.modules

import com.project.bukuwurangassignment.Application
import com.project.bukuwurangassignment.data.sharedPref.SharedPrefs
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseBinder {
    @Provides
    @Singleton
    fun provideSharedPreferences(app: Application): SharedPrefs =
        SharedPrefs(app.applicationContext)
}