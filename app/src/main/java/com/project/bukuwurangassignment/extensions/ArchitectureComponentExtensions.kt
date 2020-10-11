package com.project.bukuwurangassignment.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.project.bukuwurangassignment.base.Event
import com.project.bukuwurangassignment.base.EventObserver

fun <T> LifecycleOwner.observe(liveData: LiveData<T>?, action: (t: T) -> Unit) {
    liveData?.observe(this, Observer { it?.let { t -> action(t) } })
}

fun <T> LifecycleOwner.observeEvent(liveData: LiveData<Event<T>>, action: (t: T) -> Unit) {
    liveData.observe(this,
        EventObserver {
            it?.let { t ->
                action(t)
            }
        })
}

