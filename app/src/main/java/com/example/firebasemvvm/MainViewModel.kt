package com.example.firebasemvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

   private val repo = Repo
    fun fetchUserData(): LiveData<MutableList<Data>> {
        val mutableData = MutableLiveData<MutableList<Data>>()
        repo.getUserData().observeForever {Datalist->
            mutableData.value = Datalist

        }
        return mutableData
    }

}