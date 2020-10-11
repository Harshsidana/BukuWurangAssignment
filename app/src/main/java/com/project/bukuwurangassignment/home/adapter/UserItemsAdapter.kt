package com.project.bukuwurangassignment.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.project.bukuwurangassignment.R
import com.project.bukuwurangassignment.data.remote.sources.response.Response
import kotlinx.android.synthetic.main.home_user_item.view.*

class UserItemsAdapter : RecyclerView.Adapter<UserItemsAdapter.UserItemVh>() {
    private var listItems: MutableList<Response.Data> = mutableListOf()
    fun addList(dataList: List<Response.Data>) {
        listItems = dataList.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemVh {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.home_user_item, parent, false)
        return UserItemVh(view)
    }

    override fun onBindViewHolder(holder: UserItemVh, position: Int) {
        holder.bind(listItems[position])
    }


    class UserItemVh(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(
            userItemResponse: Response.Data
        ) {
            Toast.makeText(view.context,"Bind",Toast.LENGTH_LONG).show()

            view.tvName.text=userItemResponse.firstName
            view.tvYear.text=userItemResponse.lastName.toString()
        }

    }


    override fun getItemCount(): Int {
        return listItems.size
    }
}
