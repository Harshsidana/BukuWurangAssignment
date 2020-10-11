package com.project.bukuwurangassignment.data.repoImpl

import com.project.bukuwurangassignment.data.remote.sources.UsersService
import com.project.bukuwurangassignment.data.remote.sources.response.Response
import com.project.bukuwurangassignment.data.repository.UsersRepository
import com.project.bukuwurangassignment.extensions.mapToEntity
import com.project.bukuwurangassignment.resultState.ResourceState

class UserDataRepoImpl(private val usersService : UsersService):UsersRepository {
    override suspend fun getUsers(): ResourceState<Response> {
        return usersService.getUsers().mapToEntity {
            it
        }
    }
}