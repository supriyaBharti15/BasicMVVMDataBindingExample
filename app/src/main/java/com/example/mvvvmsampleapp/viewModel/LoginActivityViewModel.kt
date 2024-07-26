package com.example.mvvvmsampleapp.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvvmsampleapp.utils.LoginListner

class LoginActivityViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null
    var loginListner: LoginListner? = null
    fun onLoginBtnClick() {
        //loginListner?.onStarted()
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            loginListner?.onFailure("Invalid email or password")
            return
        }
        //success
        loginListner?.onSuccess()
    }
}