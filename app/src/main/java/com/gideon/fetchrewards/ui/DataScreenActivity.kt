package com.gideon.fetchrewards.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gideon.fetchrewards.R
import org.koin.android.viewmodel.ext.android.viewModel

class DataScreenActivity : AppCompatActivity() {
    private val viewModel: DataScreenViewModel by viewModel()
    private lateinit var dataListAdapter: DataListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_screen)
        viewModel

        setupDataList()
        setupObservers()
    }

    private fun setupDataList() {
        val recyclerView: RecyclerView = findViewById(R.id.data_list)
        dataListAdapter = DataListAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = dataListAdapter
    }

    private fun setupObservers() {
        viewModel.dataListLiveData.observe(this, Observer {
            dataListAdapter.updateData(it)
        })
    }
}
