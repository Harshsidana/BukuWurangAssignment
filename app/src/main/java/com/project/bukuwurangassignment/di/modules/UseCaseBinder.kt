package com.project.bukuwurangassignment.di.modules

import com.project.bukuwurangassignment.data.repository.UsersRepository
import com.project.bukuwurangassignment.data.sharedPref.SharedPrefRepo
import com.project.bukuwurangassignment.useCases.FetchUserDataUseCase
import com.project.bukuwurangassignment.useCases.SharedPrefUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCasesBinder {
    @Provides
    fun provideFetchUserDataUseCase(usersRepository: UsersRepository) =
        FetchUserDataUseCase(usersRepository)
    @Provides
    fun provideSharedPrefUseCase(sharedPrefRepo: SharedPrefRepo) =
        SharedPrefUseCase(sharedPrefRepo)

}