package com.example.noteapp.data

class NotesRepository (private val dao : NoteDao){
    fun getNotes()= dao.getNotes()
    suspend fun insert(note :NoteEntity) =dao.insert(note)
    suspend fun delete(note :NoteEntity) =dao.delete(note)
    suspend fun getNoteById(id: Int) =dao.getNoteById(id )

}