package com.viru.networkserviceexample.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.viru.networkserviceexample.modelclasses.Articles
import com.viru.networkserviceexample.repository.RepositoryImpl
import kotlinx.coroutines.*

class NewsViewModel : ViewModel() {

    var news: MutableLiveData<Articles> = MutableLiveData()

    lateinit var repositoryImpl: RepositoryImpl

    fun fetchTopHeadlines() {
        repositoryImpl = RepositoryImpl()
        CoroutineScope(Dispatchers.Main).launch {
            news.value = repositoryImpl.fetchTopHeadlines()
        }
    }
}