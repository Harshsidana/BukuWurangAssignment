package com.project.bukuwurangassignment.useCases

import com.project.bukuwurangassignment.data.remote.sources.response.Response
import com.project.bukuwurangassignment.data.repository.UsersRepository
import kotlinx.coroutines.launch

class FetchUserDataUseCase(private val usersRepository: UsersRepository) :
    BaseUseCase<String, Response>() {

    override fun setup(parameter: String): FetchUserDataUseCase {
        launch {
            execute(usersRepository.getUsers(),parameter)
        }
        return this
    }


}