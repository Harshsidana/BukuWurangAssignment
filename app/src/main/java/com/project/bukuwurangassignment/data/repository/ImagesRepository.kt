package com.project.bukuwurangassignment.data.repository

import com.project.bukuwurangassignment.data.remote.sources.UsersSource
import com.project.bukuwurangassignment.data.remote.sources.response.Response
import io.reactivex.Single

class ImagesRepository(private val usersSource : UsersSource) {

    fun getImages(): Single<Response> {
       return usersSource.getImages()
    }

}