package com.example.todoappbyjetpack.domain.use_case

data class NoteUseCase(
    val getNotes: GetNotes,
    val deletedNote: DeletedNote,
    val addNote: AddNote
)
