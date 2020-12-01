package com.gideon.fetchrewards.di

import com.gideon.fetchrewards.app.BASE_URL
import com.gideon.fetchrewards.data.sources.remote.api.FetchRewardsAPI
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    // GSON
    single {
        provideGson()
    }

    // OkHttp client
    single {
        provideOkHttpClient()
    }

    // Retrofit
    single {
        provideRetrofit(
            okHttpClient = get(),
            gson = get()
        )
    }

    //API
    single {
        provideAPI(retrofit = get())
    }
}

private fun provideGson(): Gson {
    return Gson()
}

private fun provideOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder().build()
}

private fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .build()
}

private fun provideAPI(retrofit: Retrofit): FetchRewardsAPI =
    retrofit.create(FetchRewardsAPI::class.java)
