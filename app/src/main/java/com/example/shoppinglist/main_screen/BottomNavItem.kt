package com.example.shoppinglist.main_screen

import com.example.shoppinglist.R
import com.example.shoppinglist.utils.Routes

sealed class BottomNavItem(val title: String, val iconId: Int, val route: String) {
    object ListItem: BottomNavItem("List", R.drawable.icon_list, Routes.SHOPPING_LIST)
    object NoteItem: BottomNavItem("Note", R.drawable.icon_note, Routes.NOTE_LIST)
    object AboutItem: BottomNavItem("About", R.drawable.icon_about, Routes.ABOUT)
    object SettingsItem: BottomNavItem("Settings", R.drawable.icon_settings, Routes.SETTINGS)

}