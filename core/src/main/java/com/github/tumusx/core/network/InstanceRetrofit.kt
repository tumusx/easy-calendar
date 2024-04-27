package com.github.tumusx.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InstanceRetrofit {
    fun instanceRetrofit(baseUrl: String) =
        Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).build()
}