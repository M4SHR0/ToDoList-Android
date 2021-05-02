package com.example.m4shr0.todolist.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.m4shr0.todolist.TaskDao

@Database(entities = [Task::class], version = 1,exportSchema = false)
abstract class TaskRoomDatabase : RoomDatabase(){
    abstract fun taskDao() : TaskDao
}