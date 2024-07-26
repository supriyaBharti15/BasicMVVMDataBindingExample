package com.example.mvvvmsampleapp.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvvmsampleapp.R
import com.example.mvvvmsampleapp.databinding.ActivityLoginBinding
import com.example.mvvvmsampleapp.utils.LoginListner
import com.example.mvvvmsampleapp.viewModel.LoginActivityViewModel

class LoginActivity : ComponentActivity(), LoginListner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel1 = ViewModelProvider(this)[LoginActivityViewModel::class.java]
        binding.viewModel = viewModel1
        viewModel1.loginListner = this
    }

    override fun onStarted() {
        Toast.makeText(this, "Started", Toast.LENGTH_LONG).show()

    }

    override fun onSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()

    }

    override fun onFailure(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}