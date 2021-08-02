package com.viru.networkserviceexample.networkapi

import com.viru.networkserviceexample.modelclasses.Articles
import retrofit2.http.GET

interface API {
    @GET(EndPoints.topHeadlines)
    suspend fun getTopHeadlines(): Articles
}