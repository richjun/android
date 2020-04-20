package com.jyyoon.room_exam_kotlin

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jyyoon.room_exam.Todo
import com.jyyoon.room_exam.TodoDao

@Database(entities = arrayOf(Todo::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}