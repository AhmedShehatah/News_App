package com.example.newsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.R
import com.example.newsapp.databinding.ActivityNewsBinding
import com.example.newsapp.db.ArticlesDataBase
import com.example.newsapp.repo.NewsRepo

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding
    lateinit var viewModel: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.breakingNewsFragment -> {
                    navController.navigate(R.id.breakingNewsFragment)

                }
                R.id.searchNewsFragment -> {
                    navController.navigate(R.id.searchNewsFragment)
                }
                R.id.savedNewsFragment -> navController.navigate(R.id.savedNewsFragment)
            }
            true
        }
        val repo = NewsRepo(ArticlesDataBase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(repo)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[NewsViewModel::class.java]

    }


}