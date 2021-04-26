package com.example.m4shr0.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class taskAdapter : RecyclerView.Adapter<taskAdapter.taskHolder>(){
    class taskHolder(view: View) : RecyclerView.ViewHolder(view){
        val taskCheck: CheckBox
        val descriptionView: TextView
        val deadlineView: TextView
        val timelimitView: TextView

        init {
            taskCheck = view.findViewById(R.id.taskCheck)
            descriptionView = view.findViewById(R.id.description_text)
            deadlineView = view.findViewById(R.id.deadline_text)
            timelimitView = view.findViewById(R.id.timelimit_text)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): taskHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.one_task,viewGroup,false)
        return taskHolder(view)
    }

    override fun onBindViewHolder(viewHolder: taskHolder, position: Int) {
        // viewHolder.taskCheck.text = dataSet[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}