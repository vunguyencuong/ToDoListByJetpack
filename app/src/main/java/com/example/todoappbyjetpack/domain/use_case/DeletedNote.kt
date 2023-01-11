package com.example.todoappbyjetpack.domain.use_case

import com.example.todoappbyjetpack.domain.model.Note
import com.example.todoappbyjetpack.domain.repository.NoteRepository

class DeletedNote(
    private val repository: NoteRepository
) {
    suspend operator  fun invoke(note : Note){
        repository.deleteNote(note)
    }
}