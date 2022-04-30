package com.example.newsapp.ui.fragments

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.newsapp.R
import com.example.newsapp.ui.NewsActivity
import com.example.newsapp.ui.NewsViewModel


abstract class BaseFragment<T : ViewBinding> : Fragment() {

    //Binding View
    private var _binding: ViewBinding? = null
    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> T

    //this will be used in child classes
    protected val binding: T
        get() = _binding as T
    protected val viewModel: NewsViewModel
        get() = (activity as NewsActivity).viewModel
    lateinit var mDialog: Dialog


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(layoutInflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupOnViewCreated(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    //Implemented into the child class
    abstract fun setupOnViewCreated(view: View)


}