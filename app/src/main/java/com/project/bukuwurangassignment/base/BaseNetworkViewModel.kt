package com.project.bukuwurangassignment.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.project.bukuwurangassignment.useCases.NetworkUseCase
open class BaseNetworkViewModel(
    app: Application,
    private vararg val baseUseCases: NetworkUseCase<*, *>
) : AndroidViewModel(app) {
    override fun onCleared() {
        super.onCleared()
        baseUseCases.map {
            it.cancel()
        }

    }
}