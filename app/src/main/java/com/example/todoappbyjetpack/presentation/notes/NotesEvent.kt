package com.example.todoappbyjetpack.presentation.notes

import com.example.todoappbyjetpack.domain.model.Note
import com.example.todoappbyjetpack.domain.util.NoteOrder

sealed class NotesEvent{

    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
