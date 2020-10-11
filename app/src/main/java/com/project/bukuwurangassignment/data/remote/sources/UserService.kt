package com.project.bukuwurangassignment.data.remote.sources

import com.project.bukuwurangassignment.data.remote.sources.response.Response
import retrofit2.Call
import retrofit2.http.GET

interface UsersService {
    @GET("users")
    fun getUsers() : Call<Response>
}