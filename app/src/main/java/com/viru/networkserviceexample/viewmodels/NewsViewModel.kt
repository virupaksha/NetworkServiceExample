package com.viru.networkserviceexample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.viru.networkserviceexample.modelclasses.Articles
import com.viru.networkserviceexample.networkapi.ServiceManager
import kotlinx.coroutines.*

class NewsViewModel: ViewModel() {

     var news:MutableLiveData<Articles> = MutableLiveData()

     fun fetchTopHeadlines() {
        val t = CoroutineScope(Dispatchers.IO).launch {
            val service = ServiceManager.fetchNetworkService()
            val value = service.getTopHeadlines()
            CoroutineScope(Dispatchers.Main).launch {
                news.value = value
            }
        }

    }
}