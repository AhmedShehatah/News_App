package com.example.newsapp.repo

import com.example.newsapp.api.APISettings
import com.example.newsapp.db.ArticlesDataBase
import com.example.newsapp.model.Article

class NewsRepo(private val db: ArticlesDataBase) {

    suspend fun getBreakingNews(country: String, pageNumber: Int) =
        APISettings.apiInstance.getBreakingNews(country, pageNumber)

    suspend fun searchNews(country: String, pageNumber: Int) =
        APISettings.apiInstance.searchForNews(country, pageNumber)

    suspend fun updateOrInsertArticle(article: Article) =
        db.getArticleDao().updateOrInsertArticle(article)

    fun getSavedArticles() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}