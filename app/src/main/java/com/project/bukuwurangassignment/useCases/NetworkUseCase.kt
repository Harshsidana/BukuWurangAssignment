package com.project.bukuwurangassignment.useCases

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

const val MAX_RETRY = 1

abstract class NetworkUseCase<P, R> : CoroutineScope, UseCase() {

    protected var job = Job()

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + job

    abstract fun setup(parameter: P): NetworkUseCase<P, R>


    fun cancel() {
        job.cancel()
    }
}
