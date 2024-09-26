package com.example.shoppinglist.settings_screen

sealed class SettingsScreenEvent {
    data class OnItemSelected(var color : String): SettingsScreenEvent()
}