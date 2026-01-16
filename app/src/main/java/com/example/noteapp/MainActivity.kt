package com.example.noteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.example.noteapp.data.NoteDatabase
import com.example.noteapp.data.NotesRepository
import com.example.noteapp.data.NotesViewModel
import com.example.noteapp.ui.theme.NavGraph
import com.example.noteapp.ui.theme.NoteAppTheme
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,"notes_db"
        ).build()

        val repository = NotesRepository(db.noteDao())  // correct

        val viewModel = NotesViewModel(repository)

        setContent {
            NavGraph(viewModel)
        }
    }
}