package com.example.firebasemvvm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item.view.*


class MainAdapter(private val context: Context) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private var dataList = mutableListOf<Data>()
    val kode = listOf("Ismail", "Risky", "Rahmansyah")

    fun setListData(data: MutableList<Data>) {
        dataList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val addItem = layoutInflater.inflate(R.layout.item, parent, false)
        return ViewHolder(addItem)
    }

    override fun getItemCount(): Int {
        return if (dataList.size > 0) {
            dataList.size
        } else {
            0
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(data: Data) {
            itemView.textView.text = data.nama

        }
    }
}
