package com.example.kotlinui
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoAdepter(var todos: List<TodoModel>): RecyclerView.Adapter<TodoAdepter.TodoViewHolder>() {
    inner class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_tile,parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
    }
}