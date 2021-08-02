package com.viru.networkserviceexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.viru.networkserviceexample.viewmodels.NewsViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: NewsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetchTopHeadlines()

    }

    private  fun fetchTopHeadlines() {
        viewModel.fetchTopHeadlines()
        viewModel.news.observe(this, Observer {
            if (it != null) {
                Log.d("Viru1", "message is ${it.articles.size}")
            } else {
                Log.d("Viru1", "empty")
            }
        })
    }


}