package com.example.shoppinglist.utils

import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

fun ViewModel.getCurrentTime(): String {
    val formatter = SimpleDateFormat("dd.MM.yy HH:mm", Locale.getDefault())
    val cv = Calendar.getInstance()
    return formatter.format(cv.time)
}