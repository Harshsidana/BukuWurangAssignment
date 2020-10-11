package com.project.bukuwurangassignment.viewModel

import androidx.lifecycle.ViewModel
import com.project.bukuwurangassignment.data.remote.sources.response.Response
import com.project.bukuwurangassignment.data.repository.UsersRepository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.IllegalStateException


class HomeViewModel(private val usersRepository : UsersRepository) : ViewModel() {
    fun getUsers(query : String): Observable<Response> {
        return Observable.just(query)
            .map{if (it.isEmpty()){
                return@map throw IllegalStateException("empty string")
            }
                return@map it
            }
            .flatMap {
                usersRepository.getImages().toObservable()
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }


}