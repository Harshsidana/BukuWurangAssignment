package com.project.bukuwurangassignment.useCases

import androidx.lifecycle.MutableLiveData
import com.project.bukuwurangassignment.resultState.ResourceState


abstract class BaseUseCase<P, R>() : NetworkUseCase<P, R>() {
    private val liveData by lazy { MutableLiveData<ResourceState<R>>() }

    @Volatile
    private var retry = 0

    fun execute(parameter: ResourceState<R>, request: P) {
        parseResponseData(parameter, request)
    }

    private fun parseResponseData(parameter: ResourceState<R>, request: P) {
        liveData.postValue(parameter)

    }

    fun getResultLiveData() = liveData
}
