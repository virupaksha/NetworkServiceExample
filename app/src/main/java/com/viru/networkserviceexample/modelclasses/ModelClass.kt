package com.viru.networkserviceexample.modelclasses

import java.util.*

data class Articles(val list: List<ArticleInfo>) {

}

data class ArticleInfo(
    val source: NewsSource?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishesAt: String?,
    val content: String?
)

data class NewsSource(val name: String?) {

}
