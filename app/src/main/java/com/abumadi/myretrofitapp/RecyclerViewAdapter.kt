package com.abumadi.myretrofitapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var items: List<Posts>?):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {



    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        var userId = itemView.findViewById<TextView>(R.id.userIdTV)
        var id = itemView.findViewById<TextView>(R.id.IdTV)
        var title = itemView.findViewById<TextView>(R.id.titleTV)
        var body = itemView.findViewById<TextView>(R.id.bodyTV)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder,position: Int) {
        val bind = items?.get(position)

        holder.userId.text =bind?.userId.toString()
        holder.id.text = bind?.id.toString()
        holder.title.text = bind?.title
        holder.body.text = bind?.body
    }

    override fun getItemCount(): Int {
        return items!!.size
    }

}