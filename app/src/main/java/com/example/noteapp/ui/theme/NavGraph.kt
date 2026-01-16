package com.example.noteapp.ui.theme



import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import com.example.noteapp.data.NotesViewModel
import com.example.noteapp.ui.theme.notes.AddNoteScreen
import com.example.noteapp.ui.theme.notes.NotesScreen


@Composable
fun NavGraph(viewModel: NotesViewModel) {

    val navController = rememberNavController()

    NavHost(navController, startDestination = "notes") {

        composable("notes") {
            NotesScreen(
                viewModel = viewModel,
                onAddClick = { navController.navigate("add") }
            )
        }

        composable("add") {
            AddNoteScreen(
                viewModel = viewModel,
                onSave = { navController.popBackStack() }
            )
        }
    }
}
