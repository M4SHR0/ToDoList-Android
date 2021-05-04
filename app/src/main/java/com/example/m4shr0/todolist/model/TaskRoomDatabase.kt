package com.example.m4shr0.todolist.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.m4shr0.todolist.TaskDao
// スキーマを変更する予定があればexportSchema = trueにすべき
@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskRoomDatabase : RoomDatabase(){
    abstract fun taskDao() : TaskDao

    // DBは１個だけ開いてほしいので companion object
    companion object{
        @Volatile
        private var INSTANCE: TaskRoomDatabase? = null
        fun getDatabase(context: Context): TaskRoomDatabase {
            // INSTANCEが既にDBを持っていないかsynchronizedで確認
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TaskRoomDatabase::class.java,
                    "task_database").build()
                INSTANCE = instance
                instance }
        }
    }
}