package com.gideon.fetchrewards.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gideon.fetchrewards.R
import org.koin.android.viewmodel.ext.android.viewModel

class DataScreenActivity : AppCompatActivity() {
    private val viewModel: DataScreenViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_screen)
        viewModel

        setupDataList()
        setupObservers()
    }

    private fun setupDataList() {
        TODO("Not yet implemented")
    }

    private fun setupObservers() {
        TODO("Not yet implemented")
    }
}
