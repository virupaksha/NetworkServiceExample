package com.viru.networkserviceexample.networkapi

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ServiceManager {

    fun fetchNetworkService(): API {
        val retro = Retrofit.Builder()
            .baseUrl(EndPoints.baseURL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        return retro.create(API::class.java)
    }
}