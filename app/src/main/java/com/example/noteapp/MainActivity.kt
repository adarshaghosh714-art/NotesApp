package com.example.noteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.room.Room
import com.example.noteapp.data.NoteDatabase
import com.example.noteapp.data.NotesRepository
import com.example.noteapp.data.NotesViewModel
import com.example.noteapp.ui.theme.NavGraph
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,"notes_db"
        ).fallbackToDestructiveMigration()
            .build()

        val repository = NotesRepository(db.noteDao())

        val viewModel = NotesViewModel(repository)

        setContent {
            NavGraph(viewModel)
        }
    }
}