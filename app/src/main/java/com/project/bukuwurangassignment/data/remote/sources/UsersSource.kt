package com.project.bukuwurangassignment.data.remote.sources

import com.project.bukuwurangassignment.data.remote.sources.response.Response
import io.reactivex.Single

class UsersSource(private val userService : UsersService) {

    fun getImages(): Single<Response> {
        return userService.getUsers(
        )
    }
}