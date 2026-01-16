# 📝 NoteApp

A modern **Notes Application** built using **Jetpack Compose**, **Room Database**, and **MVVM architecture**. This app allows users to create, view, and manage notes efficiently with a clean and minimal UI.

---

## 📱 Features

* ✏️ Create and save notes
* 📋 View a list of saved notes
* 🧹 Clean and simple UI using Jetpack Compose
* 💾 Local data persistence using Room Database
* 🔄 Reactive UI with ViewModel and State
* 🏗️ Proper MVVM architecture

---

## 🛠️ Tech Stack

* **Language:** Kotlin
* **UI:** Jetpack Compose (Material 3)
* **Architecture:** MVVM (Model–View–ViewModel)
* **Database:** Room
* **Asynchronous Programming:** Kotlin Coroutines
* **Build Tool:** Gradle (KTS)

---

## 📂 Project Structure

```
com.example.noteapp
│
├── data
│   ├── Note.kt              # Entity
│   ├── NoteDao.kt           # DAO interface
│   ├── NoteDatabase.kt      # Room database
│   └── NoteRepository.kt    # Repository
│
├── ui
│   ├── notes
│   │   ├── NotesScreen.kt   # Notes UI
│   │   └── NoteItem.kt
│   └── theme
│
├── viewmodel
│   └── NoteViewModel.kt
│
└── MainActivity.kt
```

---

## 🚀 Getting Started

### Prerequisites

* Android Studio (Latest stable version)
* Minimum SDK: **24**
* Kotlin **1.9+**

### Installation

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/NoteApp.git
   ```

2. Open the project in **Android Studio**

3. Let Gradle sync complete

4. Run the app on an emulator or physical device

---

## 🧪 Libraries Used

* `androidx.compose.ui`
* `androidx.compose.material3`
* `androidx.room:room-runtime`
* `androidx.room:room-ktx`
* `androidx.lifecycle:lifecycle-viewmodel-compose`
* `kotlinx-coroutines`

---

## 📸 Screenshots

*(Add screenshots here)*

---

## 📌 Future Improvements

* 🗑️ Delete notes
* ✏️ Edit existing notes
* 🔍 Search notes
* 🌙 Dark mode support
* ☁️ Cloud sync

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request.

---



---

## 👨‍💻 Author

**Adarsha Ghosh**
Android Developer | Learning Jetpack Compose & Modern Android Development

---

⭐ If you like this project, don’t forget to star the repository!
