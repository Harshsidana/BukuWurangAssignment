package com.project.bukuwurangassignment.data.repository

import com.project.bukuwurangassignment.data.remote.sources.response.Response
import com.project.bukuwurangassignment.resultState.ResourceState

interface  UsersRepository {
    suspend fun getUsers(): ResourceState<Response>

}