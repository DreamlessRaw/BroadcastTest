package com.example.broadcasttest

import android.content.Context
import android.widget.Toast

fun toast(context: Context, message: String, isLong: Boolean = false) {
    when (isLong) {
        false -> Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        true -> Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}