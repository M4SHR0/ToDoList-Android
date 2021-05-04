package com.example.m4shr0.todolist

import androidx.room.*
import com.example.m4shr0.todolist.model.Task
import kotlinx.coroutines.flow.Flow

//TODO task.ktのプロパティが複数要素だからinsertとかの引数が違うかも
@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getAllTask(): Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)

    @Query("DELETE FROM tasks")
    fun deleteAllTask()
}