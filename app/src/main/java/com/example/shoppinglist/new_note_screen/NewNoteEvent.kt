package com.example.shoppinglist.new_note_screen

sealed class NewNoteEvent {
    data class OnTitleChange(var title : String): NewNoteEvent()
    data class OnDescriptionChange(var description : String): NewNoteEvent()
    object OnSave: NewNoteEvent()
}