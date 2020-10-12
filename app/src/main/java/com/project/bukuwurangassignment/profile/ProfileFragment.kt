package com.project.bukuwurangassignment.profile

import com.project.bukuwurangassignment.R
import com.project.bukuwurangassignment.base.BaseFragment
import com.project.bukuwurangassignment.extensions.showShortToast
import com.project.bukuwurangassignment.viewModel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_profile.*
import javax.inject.Inject


class ProfileFragment : BaseFragment() {
    @Inject
    lateinit var viewModel: HomeViewModel
    override val contentView: Int
        get() = R.layout.fragment_profile

    override fun setup() {
        etUserName.setText(viewModel.getUserName())
        etEmail.setText(viewModel.getEmail())
        etPhone.setText(viewModel.getPhone())
        btSave.setOnClickListener {
            if(etUserName.text.toString().isEmpty() || etEmail.text.toString().isEmpty()|| etPhone.text.toString().isEmpty()){
                context?.showShortToast("Please enter the above fields")

            }
            else
            {
                viewModel.setEmail(etEmail.text.toString())
                viewModel.setUserName(etUserName.text.toString())
                viewModel.setPhone(etPhone.text.toString())
                context?.showShortToast("Details saved successfully")


            }

        }
    }

}