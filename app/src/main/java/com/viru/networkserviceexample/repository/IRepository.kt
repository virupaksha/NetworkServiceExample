package com.viru.networkserviceexample.repository

import com.viru.networkserviceexample.modelclasses.Articles

interface IRepository {
    suspend fun fetchTopHeadlines(): Articles
}