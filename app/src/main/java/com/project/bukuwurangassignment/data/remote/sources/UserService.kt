package com.project.bukuwurangassignment.data.remote.sources

import com.project.bukuwurangassignment.data.remote.sources.response.Response
import io.reactivex.Single
import retrofit2.http.GET

interface UsersService {
    @GET("/users")
    fun getUsers() : Single<Response>
}