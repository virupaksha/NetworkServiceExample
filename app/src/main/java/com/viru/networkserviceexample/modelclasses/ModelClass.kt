package com.viru.networkserviceexample.modelclasses

import java.util.*
import javax.sql.StatementEvent

data class Articles(val totalResults:Int, val articles: List<ArticleInfo>) {

}

data class ArticleInfo(
    val source: NewsSource?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
)

data class NewsSource(val name: String?) {

}
