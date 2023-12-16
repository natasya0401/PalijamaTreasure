package com.app.palijamatreasure.views.ui.Login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _loginStatus = MutableLiveData<Boolean>()
    val loginStatus: LiveData<Boolean>
        get() = _loginStatus

    fun loginUser(username: String) {
        // Perform login logic here
        // For simplicity, I'm using a hardcoded condition to simulate a successful login
        val isLoggedIn = username.isNotEmpty()
        _loginStatus.value = isLoggedIn
    }
}