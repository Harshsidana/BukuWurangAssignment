package com.project.bukuwurangassignment.extensions

import android.content.Context
import android.widget.Toast

fun Context.showShortToast(str: String) = Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
