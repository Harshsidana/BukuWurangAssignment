package com.project.bukuwurangassignment.home

import android.util.Log
import android.widget.Toast
import com.project.bukuwurangassignment.R
import com.project.bukuwurangassignment.base.BaseFragment
import com.project.bukuwurangassignment.extensions.observe
import com.project.bukuwurangassignment.extensions.observeEvent
import com.project.bukuwurangassignment.extensions.showShortToast
import com.project.bukuwurangassignment.home.adapter.UserItemsAdapter
import com.project.bukuwurangassignment.resultState.ResourceState
import com.project.bukuwurangassignment.viewModel.HomeViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment() {
    private lateinit var userItemsAdapter: UserItemsAdapter
    @Inject
    lateinit var viewModel: HomeViewModel
    override val contentView: Int
        get() = R.layout.fragment_home

    override fun setup() {
        homeUserItems.adapter = UserItemsAdapter()
            .also {
                userItemsAdapter = it
            }

        observe( viewModel.getUsers())
        {
            when(it)
            {
                is ResourceState.Success->{
                    userItemsAdapter.addList((it.body.data ?: mutableListOf()))
                }
                is ResourceState.Failure->{
                    context?.showShortToast("Something Went wrong")

                }
            }



        }


    }




}