package com.gideon.fetchrewards.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gideon.fetchrewards.R
import com.gideon.fetchrewards.domain.models.DataItem

class DataListAdapter(private val context: Context) :
    RecyclerView.Adapter<DataListAdapter.DataListViewHolder>() {

    private var dataList = mutableListOf<DataItem>()

    fun updateData(dataList: MutableList<DataItem>) {
        this.dataList = dataList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataListViewHolder {
        return DataListViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.data_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DataListViewHolder, position: Int) {
        val dataItem: DataItem = dataList[position]
        holder.dataListItemId.text = dataItem.id.toString()
        holder.dataListItemListId.text = dataItem.listId.toString()
        holder.dataListItemName.text = dataItem.name
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class DataListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var dataListItemListId : TextView = view.findViewById(R.id.data_list_item_list_id)
        var dataListItemId: TextView = view.findViewById(R.id.data_list_item_id)
        var dataListItemName: TextView = view.findViewById(R.id.data_list_item_name)
    }
}