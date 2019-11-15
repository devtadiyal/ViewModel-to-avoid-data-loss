package com.logzero.myapplication

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainActivityViewModel : ViewModel() {



    val TAG = MainActivityViewModel::class.java.name
    var myRandomNumber: String? = null

    fun randomNumber(): String? {
        if (myRandomNumber == null) {
           // myRandomNumber = MutableLiveData()
            generateRandomNo()
        }
        return myRandomNumber
    }

    fun generateRandomNo() {
        val random = java.util.Random()
       // myRandomNumber!!.setValue("Random Number: " + random.nextInt(10 - 1) + 1)
        myRandomNumber = "Random Number: " + random.nextInt(10 - 1) + 1
        Log.v(TAG, "Random Number: " + random.nextInt(10 - 1) + 1)
    }

    override fun onCleared() {
        super.onCleared()
        Log.v(TAG, "VIEW MODEL DESTROYED")
    }

}
