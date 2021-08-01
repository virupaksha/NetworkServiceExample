package com.viru.networkserviceexample.networkapi

class EndPoints {
    //    val getNews = "28023758f70a4da095d3eea423dc2b06"
    companion object {
        private const val key = "28023758f70a4da095d3eea423dc2b06"
        const val baseURL = "https://newsapi.org/v2/"

        const val topHeadlines = "top-headlines?country=us&category=business&apiKey=$key"
    }

}