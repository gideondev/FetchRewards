package com.gideon.fetchrewards.di

import com.gideon.fetchrewards.ui.DataScreenViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel {
        DataScreenViewModel(dataRepository = get())
    }
}
