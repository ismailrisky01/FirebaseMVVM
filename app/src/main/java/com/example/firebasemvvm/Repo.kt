package com.example.firebasemvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DatabaseReference
import com.google.firebase.firestore.FirebaseFirestore

object Repo {

    fun getUserData(): LiveData<MutableList<Data>> {
        val mutableList = MutableLiveData<MutableList<Data>>()
        FirebaseFirestore.getInstance().collection("Kode").get().addOnSuccessListener { result ->
            val lisData = mutableListOf<Data>()
            for (document in result) {
                val nama = document.getString("Nama")
                val jam = document.getString("Jam")
                val datas = Data(nama!!, jam!!)
                lisData.add(datas)
            }
            mutableList.value=lisData

        }
        return mutableList

    }
}