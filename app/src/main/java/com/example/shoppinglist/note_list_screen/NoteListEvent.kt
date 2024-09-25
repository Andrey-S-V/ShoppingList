package com.example.shoppinglist.note_list_screen

import com.example.shoppinglist.data.NoteItem

sealed class NoteListEvent {
    data class OnShowDeleteDialog(var item : NoteItem): NoteListEvent()
    data class OnItemClick(var route : String): NoteListEvent()
    object UnDoneDeleteItem: NoteListEvent()
}