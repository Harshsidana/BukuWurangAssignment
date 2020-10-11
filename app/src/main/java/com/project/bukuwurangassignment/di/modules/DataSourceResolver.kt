package com.project.bukuwurangassignment.di.modules

import com.project.bukuwurangassignment.data.remote.config.ApiManager
import com.project.bukuwurangassignment.data.remote.sources.UsersSource
import com.project.bukuwurangassignment.data.repository.UsersRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataSourceResolver {
    @Singleton
    @Provides
    fun provideMovieDataSource( apiManager : ApiManager
    ) : UsersSource = UsersSource( apiManager.userService)

    @Singleton
    @Provides
    fun provideSearcheRepository(usersSource: UsersSource) : UsersRepository = UsersRepository(usersSource)

}