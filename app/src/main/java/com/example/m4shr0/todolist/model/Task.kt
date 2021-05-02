package com.example.m4shr0.todolist.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val task_id: Int,
    var task_name: String,
    var task_desc: String?,
    var task_deadline: String?,
    var task_timelimit: String?)
