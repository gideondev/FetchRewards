package com.gideon.fetchrewards.ui

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gideon.fetchrewards.domain.models.DataItem

class DataListAdapter(private val context: Context) :
    RecyclerView.Adapter<DataListAdapter.DataListViewHolder>() {

    private var dataList = mutableListOf<DataItem>()

    fun updateData(dataList: MutableList<DataItem>) {
        this.dataList = dataList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DataListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class DataListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}