package com.viru.networkserviceexample.repository

import android.util.Log
import com.viru.networkserviceexample.modelclasses.Articles
import com.viru.networkserviceexample.networkapi.ServiceManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async

class RepositoryImpl : IRepository {
    override suspend fun fetchTopHeadlines(): Articles {
        val deferred = CoroutineScope(Dispatchers.IO).async {
            val service = ServiceManager.fetchNetworkService()
            service.getTopHeadlines()
        }
        return deferred.await()
    }
}