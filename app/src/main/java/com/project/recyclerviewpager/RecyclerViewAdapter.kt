package com.project.recyclerviewpager

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by sonseongbin on 2017. 11. 27..
 */
class RecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_text, parent, false))


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textView?.text = "text$position"
    }

    override fun getItemCount(): Int = 100

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView by lazy {
            itemView.findViewById<TextView>(R.id.textView)
        }
    }

}