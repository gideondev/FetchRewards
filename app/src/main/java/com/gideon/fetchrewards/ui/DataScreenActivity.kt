package com.gideon.fetchrewards.ui

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
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
        // Observing data list
        viewModel.dataListLiveData.observe(this, {
            dataListAdapter.updateData(it)
        })

        // Observing loading indicator
        viewModel.dataLoadingLiveData.observe(this, {
            val dataItemsLoadingIndicator =
                findViewById<ProgressBar>(R.id.data_items_loading_indicator)
            if (it) {
                dataItemsLoadingIndicator.visibility = View.VISIBLE
            } else {
                dataItemsLoadingIndicator.visibility = View.GONE
            }
        })

        // Observing errors.
        viewModel.dataLoadingFailedLiveData.observe(this, {
            if (it) {
                showDataLoadingFailedErrorDialog()
            }
        })
    }

    private fun showDataLoadingFailedErrorDialog() {
        AlertDialog.Builder(this)
            .setTitle(getString(R.string.error))
            .setMessage(getString(R.string.data_retrieval_error))
            .setPositiveButton(getString(R.string.yes), null)
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show()
    }
}
