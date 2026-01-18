package com.example.noteapp.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class NotesViewModel(
    private val repository: NotesRepository): ViewModel(){

        val notes = repository.getNotes()
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(),emptyList())

    fun addNote(title: String,content:String){
        viewModelScope.launch {
            repository.insert(
                NoteEntity(
                    title = title,
                    content = content,
                    timestamp = System.currentTimeMillis(),
                    id =0
                )
            )
        }
    }
    fun deleteNote(note: NoteEntity){
        viewModelScope.launch {
            repository.delete(note)
        }
    }
    }

