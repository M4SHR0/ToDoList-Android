package com.example.m4shr0.todolist

import androidx.room.*
import com.example.m4shr0.todolist.model.Task

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getAllTask(): List<Task>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(Task: Task)

    @Update
    fun updateTask(Task: Task)

    @Delete
    fun deleteTask(Task: Task)

    @Query("DELETE FROM tasks")
    fun deleteAllTask()
}