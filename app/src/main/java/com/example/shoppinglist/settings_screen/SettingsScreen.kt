package com.example.shoppinglist.settings_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.shoppinglist.ui.theme.DarkBlue
import com.example.shoppinglist.ui.theme.DarkText
import com.example.shoppinglist.ui.theme.LightText

@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel = hiltViewModel()
) {
    val list = viewModel.colorItemListState.value
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue)
    ) {
        Text(
            text = "Title color",
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp),
            color = DarkText
        )
        Text(
            text = "Select a title color:",
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 16.dp),
            color = LightText
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            items(list) { item ->
                UiColorItem(item) { event ->
                    viewModel.onEvent(event)
                }
            }
        }
    }
}