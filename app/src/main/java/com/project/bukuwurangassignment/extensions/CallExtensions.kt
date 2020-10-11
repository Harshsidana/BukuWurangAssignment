package com.project.bukuwurangassignment.extensions

import android.annotation.SuppressLint
import com.project.bukuwurangassignment.resultState.ResourceState
import retrofit2.Call

@SuppressLint("DefaultLocale")
fun <F, T> Call<F>.mapToEntity(
    mapper: (F) -> T
): ResourceState<T> {
    return try {
        val response = this.execute()
        if (response.isSuccessful) {
            val body = response.body()
            ResourceState.Success(mapper(body as F), response.code())

        } else {
            ResourceState.Failure(
                Exception(response.message()),
                code = response.code()
            )
        }
    }
    catch (exception: Exception) {
        ResourceState.Failure(
            Exception("Something Went Wrong"),
            code = 500
        )
    }
}
