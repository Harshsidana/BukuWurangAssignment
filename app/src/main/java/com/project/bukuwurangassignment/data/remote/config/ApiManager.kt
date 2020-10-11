package com.project.bukuwurangassignment.data.remote.config
import com.project.bukuwurangassignment.data.remote.sources.UsersService
import retrofit2.Retrofit

class ApiManager(private val retrofit : Retrofit) {

    val userService : UsersService by lazy {
        retrofit.create(UsersService::class.java)
    }

}