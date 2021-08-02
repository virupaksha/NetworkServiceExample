package com.viru.networkserviceexample.networkapi

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object ServiceManager {

    fun fetchNetworkService(): API {
        val interceptor = HttpLoggingInterceptor()
        val level = interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .retryOnConnectionFailure(true)
            .connectTimeout(30, TimeUnit.SECONDS)
            .build()

        val retro = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(EndPoints.baseURL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        return retro.create(API::class.java)
    }
}