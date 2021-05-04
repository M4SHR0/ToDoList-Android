package com.example.m4shr0.todolist.model

import androidx.annotation.WorkerThread
import com.example.m4shr0.todolist.TaskDao
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {
    val allTasks: Flow<List<Task>> = taskDao.getAllTask()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(task: Task) {
        taskDao.insertTask(task)
    }

}