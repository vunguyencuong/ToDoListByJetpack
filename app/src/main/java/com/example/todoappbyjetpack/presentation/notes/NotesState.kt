package com.example.todoappbyjetpack.presentation.notes

import com.example.todoappbyjetpack.domain.model.Note
import com.example.todoappbyjetpack.domain.util.NoteOrder
import com.example.todoappbyjetpack.domain.util.OrderType

data class NotesState(
    val notes : List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
    ) {


}