package com.example.listtask

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listatareas.database.TaskEntry



class TaskAdapter(private var mTaskEntries:List<TaskEntry>, private val mContext: Context,
                  private val clickListener:(TaskEntry)->Unit): RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskAdapter.TaskViewHolder {
        val layoutInflater= LayoutInflater.from(mContext)
        return TaskViewHolder(layoutInflater.inflate(R.layout.task_layout,parent,false))

    }

    override fun getItemCount(): Int = mTaskEntries.size

    override fun onBindViewHolder(holder: TaskAdapter.TaskViewHolder, position: Int) {
        holder.bind(mTaskEntries[position], mContext, clickListener)
    }
    class TaskViewHolder {

    }
}


