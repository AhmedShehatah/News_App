package com.example.newsapp.ui.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.example.newsapp.databinding.FragmentArticleBinding
import com.example.newsapp.model.Article
import com.google.android.material.snackbar.Snackbar


class ArticleFragment : BaseFragment<FragmentArticleBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentArticleBinding
        get() = FragmentArticleBinding::inflate
    private val args: ArticleFragmentArgs by navArgs()
    private lateinit var article: Article
    override fun setupOnViewCreated(view: View) {
        article = args.article
        binding.webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url!!)
        }
        binding.fab.setOnClickListener { saveArticle() }


    }

    private fun saveArticle() {
        viewModel.saveArticle(article)
        Snackbar.make(binding.root, "Article Saved Successfully", Snackbar.LENGTH_SHORT).show()
    }
}